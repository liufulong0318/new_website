package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.WebsiteUser;
import com.golden.website.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Api(value = "UserController", description = "用户管理")
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value="获取所有用户信息", notes="获取所有用户信息")
    @RequestMapping(value = "getAllUser",method = RequestMethod.POST)
    public String getAllUser(HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                return userService.getAllUser().toString();
            }else{
                resultInfo = new ResultInfo();
                resultInfo.setCode("0");
                resultInfo.setMsg("对不起，您没有权限");
                return resultInfo.toString();
            }
        }else{
            return resultInfo.toString();
        }
    }

    @ApiOperation(value="根据id获取用户信息", notes="根据id获取用户信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "String")
    @RequestMapping(value = "getUserById",method = RequestMethod.POST)
    public String getUserById(HttpServletRequest request) {
        return userService.getUserById(request).toString();
    }

    @ApiOperation(value="根据id修改用户信息", notes="根据id修改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "loginUserName", value = "登录用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "sex", value = "性别", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "name", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "role", value = "角色", required = true, dataType = "String")})
    @RequestMapping(value = "editUser",method = RequestMethod.POST)
    public String editUser(HttpServletRequest request) {
        return userService.editUser(request).toString();
    }

    @ApiOperation(value="根据id删除用户信息", notes="根据id删除用户信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "String")
    @RequestMapping(value = "deleteUserById",method = RequestMethod.GET)
    public String deleteUerById(HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                return userService.deleteUerById(request).toString();
            }else{
                resultInfo = new ResultInfo();
                resultInfo.setCode("0");
                resultInfo.setMsg("对不起，您没有权限");
                return resultInfo.toString();
            }
        }else{
            return resultInfo.toString();
        }
    }

    @ApiOperation(value="根据登录用户名修改用户密码", notes="根据登录用户名修改用户密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "loginUserName", value = "登录用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "src_password", value = "原密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "new_password", value = "新密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "new_password2", value = "确认新密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "code", value = "验证码", required = true, dataType = "String")})
    @RequestMapping(value = "updatePwd",method = RequestMethod.POST)
    public String updatePwd(HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            return userService.updatePwd(request).toString();
        }else{
            return resultInfo.toString();
        }
    }

    @ApiOperation(value="登录", notes="登录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "loginUserName", value = "登录用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "code", value = "验证码", required = true, dataType = "String")})
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        return userService.login(request).toString();
    }

    @ApiOperation(value="保存我的信息", notes="保存我的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "name", value = "姓名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "sex", value = "性别", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bank", value = "开户行", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bankacount", value = "开户行账号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "tin", value = "纳税人识别号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "type", value = "开票种类", required = true, dataType = "String"),
            })
    @RequestMapping(value = "saveMyInfo",method = RequestMethod.POST)
    public String saveMyInfo(HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            return userService.saveMyInfo(request).toString();
        }else{
            return resultInfo.toString();
        }
    }

    @ApiOperation(value="检查是否登录", notes="检查是否登录")
    @RequestMapping(value = "checkIsLogin",method = RequestMethod.POST)
    public ResultInfo checkIsLogin(HttpServletRequest request) {
        return userService.checkIsLogin(request);
    }

    @ApiOperation(value="获取用户信息", notes="根据当前登录名获取用户信息")
    @RequestMapping(value = "getUserInfoByLoginName",method = RequestMethod.POST)
    public String getUserInfoByLoginName(HttpServletRequest request) {
        return userService.getUserInfoByLoginName(request);
    }
}
