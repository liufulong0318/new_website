package com.golden.website.controller;

import com.golden.website.commons.GeneratingVerificationCode;
import com.golden.website.commons.ResultInfo;
import com.golden.website.server.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class RegisterController {

    @Autowired
    RegisterService registerService;
    @RequestMapping("register")
    public String register(HttpServletRequest request){
        return registerService.register(request);
    }
    @RequestMapping("GeneratingVerificationCode")
    public String GeneratingVerificationCode() throws IOException {
        return GeneratingVerificationCode.createImage()+"|"+ UUID.randomUUID();
    }
}
