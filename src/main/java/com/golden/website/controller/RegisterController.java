package com.golden.website.controller;

import com.golden.website.commons.GeneratingVerificationCode;
import com.golden.website.commons.ResultInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class RegisterController {
    @RequestMapping("register")
    public String register(Model model,HttpServletRequest request){
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode("0");
        resultInfo.setMsg("注册成功");
        String username = request.getParameter("username");
        String url = request.getParameter("url");
        System.out.println("username: "+username);
        System.out.println("url: "+url);
        return "\""+url+"\"";
    }
    @RequestMapping("GeneratingVerificationCode")
    public String GeneratingVerificationCode() throws IOException {
        return GeneratingVerificationCode.createImage();
    }
}
