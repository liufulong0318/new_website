package com.golden.website.controller;

import com.golden.website.dataobject.WebsiteUser;
import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    public List<WebsiteUser> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("getUserById")
    public String getUserById(HttpServletRequest request) {
        return userService.getUserById(request).toString();
    }

    @RequestMapping("editUser")
    public String editUser(HttpServletRequest request) {
        return userService.editUser(request).toString();
    }

    @RequestMapping("deleteUserById")
    public String deleteUerById(HttpServletRequest request) {
        return userService.deleteUerById(request).toString();
    }

    @RequestMapping("updatePwd")
    public String updatePwd(HttpServletRequest request) {
        return userService.updatePwd(request).toString();
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request) {
        return userService.login(request).toString();
    }

    @RequestMapping("saveMyInfo")
    public String saveMyInfo(HttpServletRequest request) {
        return userService.saveMyInfo(request).toString();
    }
}
