package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.WebsiteUser;
import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
}
