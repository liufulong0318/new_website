package com.golden.website.controller;

import com.golden.website.commons.GeneratingVerificationCode;
import com.golden.website.commons.ResultInfo;
import com.golden.website.server.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;
@Api(value = "RegisterController", description = "注册管理")
@RestController
@RequestMapping("/")
public class RegisterController {

    @Autowired
    RegisterService registerService;
    @ApiOperation(value="用户注册", notes="用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "loginUserName", value = "登录用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "password", value = "登录密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "code", value = "验证码", required = true, dataType = "String")})
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String register(HttpServletRequest request) {
        return registerService.register(request);
    }
    @ApiOperation(value="生成验证码", notes="生成验证码")
    @RequestMapping(value = "GeneratingVerificationCode",method = RequestMethod.GET)
    public String GeneratingVerificationCode() throws IOException {
        return GeneratingVerificationCode.createImage() + "|" + UUID.randomUUID();
    }
}
