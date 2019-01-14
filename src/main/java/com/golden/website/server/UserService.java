package com.golden.website.server;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.WebsiteUser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    WebsiteUser getUserById(HttpServletRequest request);

    List<WebsiteUser> getAllUser();

    ResultInfo editUser(HttpServletRequest request);

    ResultInfo deleteUerById(HttpServletRequest request);

    ResultInfo login(HttpServletRequest request);

    ResultInfo updatePwd(HttpServletRequest request);

    void logout(HttpServletRequest request);

}
