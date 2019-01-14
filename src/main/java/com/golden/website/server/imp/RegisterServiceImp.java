package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsitePwdMapper;
import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.WebsitePwd;
import com.golden.website.dataobject.WebsiteUser;
import com.golden.website.server.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegisterServiceImp implements RegisterService {
    @Autowired
    WebsiteUserMapper websiteUserMapper;
    @Autowired
    WebsitePwdMapper websitePwdMapper;

    @Override
    public String register(HttpServletRequest request) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode("1");
        resultInfo.setMsg("注册成功");
        String loginUserName = request.getParameter("loginUserName").trim();
        //对用户名进行验证
        if (loginUserName.length() < 6) {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，用户名长度不能低于6位");
            return resultInfo.toString();
        } else if (loginUserName.length() > 30) {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，用户名长度不能大于30位");
            return resultInfo.toString();
        } else if (loginUserName.length() >= 6 && loginUserName.length() <= 30) {
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(loginUserName);
            if (!m.matches()) {
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，用户名含有非法字符");
                return resultInfo.toString();
            }
        }
        String password = request.getParameter("password");
        //验证密码
        if (password.length() != 32) {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，密码长度必须为8位");
            return resultInfo.toString();
        } else {
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(password);
            if (!m.matches()) {
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，密码含有非法字符");
                return resultInfo.toString();
            }
        }
        String code = request.getParameter("code");
        //验证码校验
        Jedis jedis = new Jedis("localhost");
        Boolean exists = jedis.exists(code);
        if (exists) {
            if (!((code.hashCode() + "").equals(jedis.get(code)))) {
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，验证码错误");
                return resultInfo.toString();
            }
        } else {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，验证码失效");
            return resultInfo.toString();
        }
        WebsiteUser websiteUser = new WebsiteUser();
        String id = UUID.randomUUID().toString();
        websiteUser.setId(id);
        websiteUser.setLoginusername(loginUserName);
        websiteUser.setRegistertime(new Date());
        websiteUser.setState("0");
        websiteUser.setSex("1");
        websiteUser.setErrorcount(0);
        websiteUser.setRole("0");
        int saveUserInfo = websiteUserMapper.insert(websiteUser);
        if (saveUserInfo < 1) {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，系统内部错误，请稍后重试");
            return resultInfo.toString();
        }
        WebsitePwd websitePwd = new WebsitePwd();
        websitePwd.setId(id);
        websitePwd.setPassword(password);
        int savePwdInfo = websitePwdMapper.insert(websitePwd);
        if (savePwdInfo < 1) {
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，系统内部错误，请稍后重试");
            return resultInfo.toString();
        }
        return resultInfo.toString();
    }
}
