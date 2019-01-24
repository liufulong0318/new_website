package com.golden.website.aspect;

import com.golden.website.dao.LogsMapper;
import com.golden.website.dataobject.Logs;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Component
@Aspect
public class HttpAspect {
    @Autowired
    Logs logs;
    @Autowired
    LogsMapper logsMapper;

    private String id;
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.golden.website.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        this.id = UUID.randomUUID().toString();
        logs.setId(this.id);
        ServletRequestAttributes attributies = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributies.getRequest();
        // url
        StringBuffer url = request.getRequestURL();
        logger.info("url={}", url);
        logs.setUrl(url.toString());
        // method
        String method = request.getMethod();
        logger.info("method={}", method);
        logs.setMethod(method);
        // ip
        String ip = request.getRemoteAddr();
        logger.info("ip={}", ip);
        logs.setIp(ip);
        // 类方法
        String class_method = joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName();
        logger.info("class_method={}", class_method);
        logs.setClassMethod(class_method);
        // 参数
        Object[] args = joinPoint.getArgs();
        logger.info("args={}", args.toString());
        logs.setArgs(args.toString());
        logs.setReqtime(new Date());
        logsMapper.insert(logs);
    }

    @After("log()")
    public void doAfter() {

    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        if (object != null) {
            logs.setResponse(object.toString());
            logger.info("response={}", object.toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(logs.getReqtime());
            BigDecimal stime = new BigDecimal(calendar.getTimeInMillis());
            BigDecimal endtime = new BigDecimal(System.currentTimeMillis());
            BigDecimal cost = endtime.subtract(stime);
            logs.setTimecost(cost);
            logsMapper.updateByPrimaryKey(logs);
        }
    }
}
