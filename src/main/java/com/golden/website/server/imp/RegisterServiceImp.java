package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.server.RegisterService;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegisterServiceImp implements RegisterService{
    @Override
    public String register(HttpServletRequest request) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode("1");
        resultInfo.setMsg("注册成功");
        String loginUserName = request.getParameter("loginUserName").trim();
        //对用户名进行验证
        if(loginUserName.length() < 6){
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，用户名长度不能低于8位");
            return resultInfo.toString();
        }else if(loginUserName.length() > 30){
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，用户名长度不能大于30位");
            return resultInfo.toString();
        }else if(loginUserName.length() >= 6 && loginUserName.length() <= 30){
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(loginUserName);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，用户名含有非法字符");
                return resultInfo.toString();
            }
        }
        String password = request.getParameter("password");
        //验证密码
        if(password.length() != 32){
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，密码长度必须为8位");
            return resultInfo.toString();
        }else{
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(loginUserName);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，密码含有非法字符");
                return resultInfo.toString();
            }
        }
        String code = request.getParameter("code");
        //验证码校验
        Jedis jedis = new Jedis("localhost");
        Boolean exists = jedis.exists(code);
        if(exists){
            if(!((code.hashCode()+"").equals(jedis.get(code)))){
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，验证码错误");
                return resultInfo.toString();
            }
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，验证码错误");
            return resultInfo.toString();
        }
        System.out.println("loginUserName: "+loginUserName+", password: "+password+", code: "+code);
        return resultInfo.toString();
    }
}
