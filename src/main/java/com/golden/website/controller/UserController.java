package com.golden.website.controller;

import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user")
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("home")
    public String getUser(Model model){
        userService.getUser();
        model.addAttribute("name","liufulong");
        return "home";
    }
}
