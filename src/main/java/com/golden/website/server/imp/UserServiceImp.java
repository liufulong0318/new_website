package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.WebsiteUser;
import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    WebsiteUserMapper websiteUserMapper;

    @Override
    public WebsiteUser getUserById(HttpServletRequest request) {
        return websiteUserMapper.selectByPrimaryKey(request.getParameter("id"));
    }

    @Override
    public List<WebsiteUser> getAllUser() {
        return websiteUserMapper.selectAll();
    }

    @Override
    public ResultInfo editUser(HttpServletRequest request) {
        ResultInfo resultInfo = new ResultInfo();
        WebsiteUser websiteUser = new WebsiteUser();
        websiteUser.setId(request.getParameter("id"));
        websiteUser.setLoginusername(request.getParameter("loginusername"));
        websiteUser.setState(request.getParameter("state"));
        websiteUser.setName(request.getParameter("name"));
        websiteUser.setSex(request.getParameter("sex"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String registertime = request.getParameter("registertime");
        try {
            websiteUser.setRegistertime(sdf.parse(registertime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int count = websiteUserMapper.updateByPrimaryKey(websiteUser);
        if (count > 0) {
            resultInfo.setCode("1");
            resultInfo.setMsg("修改信息成功");
        } else {
            resultInfo.setCode("0");
            resultInfo.setMsg("修改信息失败，请稍后重试");
        }
        return resultInfo;
    }

    @Override
    public ResultInfo login(HttpServletRequest request) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode("1");
        resultInfo.setMsg("登录成功");
        String loginusername = request.getParameter("loginusername");

        //对用户名进行验证
        if (loginusername.length() < 6) {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，用户名错误");
            return resultInfo;
        } else if (loginusername.length() > 30) {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，用户名错误");
            return resultInfo;
        } else if (loginusername.length() >= 6 && loginusername.length() <= 30) {
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(loginusername);
            if (!m.matches()) {
                resultInfo.setCode("0");
                resultInfo.setMsg("登录失败，用户名含有非法字符");
                return resultInfo;
            }
        }
        //检查用户名是否存在
        List<WebsiteUser> list = websiteUserMapper.checkLoginusername(loginusername);
        if (list.size() < 1) {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，用户名不存在");
            return resultInfo;
        }
        String password = request.getParameter("password");
        //验证密码
        if (password.length() != 32) {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，密码错误");
            return resultInfo;
        } else {
            String pattern = "^[A-Za-z0-9]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(password);
            if (!m.matches()) {
                resultInfo.setCode("0");
                resultInfo.setMsg("登录失败，密码含有非法字符");
                return resultInfo;
            }
        }
        String code = request.getParameter("code");
        //验证码校验
        Jedis jedis = new Jedis("localhost");
        Boolean exists = jedis.exists(code);
        if (exists) {
            if (!((code.hashCode() + "").equals(jedis.get(code)))) {
                resultInfo.setCode("0");
                resultInfo.setMsg("登录失败，验证码错误");
                return resultInfo;
            }
        } else {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，验证码失效");
            return resultInfo;
        }
        //验证用户名和密码是否正确
        WebsiteUser a = new WebsiteUser();
        a.setLoginusername(loginusername);
        a.setPassword(password);
        WebsiteUser websiteUser = websiteUserMapper.checkLoginusernameAndPassword(a);
        if (websiteUser == null) {
            WebsiteUser w1 = websiteUserMapper.selectByLoginUserName(loginusername);
            int errorCount = w1.getErrorcount();
            if (errorCount != 3) {//错误次数未达到3次，更新错误次数，不锁定
                websiteUserMapper.updateByLoginUsername_errorCount(loginusername);
            } else {//更新用户状态为锁定
                websiteUserMapper.updateByLoginUsername_State(loginusername);
                resultInfo.setCode("0");
                resultInfo.setMsg("登录失败，用户名被锁定");
                return resultInfo;
            }
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，用户名或密码错误");
            return resultInfo;
        } else if ("1".equals(websiteUser.getState())) {
            resultInfo.setCode("0");
            resultInfo.setMsg("登录失败，用户名被锁定");
            return resultInfo;
        }
//        HttpSession session = request.getSession();
//        System.out.println(session.getId());
//        session.setAttribute("token", UUID.randomUUID().toString());
//        session.setAttribute("loginusername", loginusername);
        return resultInfo;
    }
}
