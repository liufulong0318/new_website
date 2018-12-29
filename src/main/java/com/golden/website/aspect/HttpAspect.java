package com.golden.website.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.golden.website.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributies = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributies.getRequest();
        // url
        StringBuffer url = request.getRequestURL();
        logger.info("url={}", url);
        // method
        String method = request.getMethod();
        logger.info("method={}", method);
        // ip
        String ip = request.getRemoteAddr();
        logger.info("ip={}", ip);
        // 类方法
        String class_method = joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName();
        logger.info("class_method={}", class_method);
        // 参数
        Object[] args = joinPoint.getArgs();
        logger.info("args={}", args);
    }

    @After("log()")
    public void doAfter() {

    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        if (object != null) {
            logger.info("response={}", object.toString());
        }
    }
}
