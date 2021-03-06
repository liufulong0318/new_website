package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteOrderMapper;
import com.golden.website.dao.WebsiteProductbuyinfoMapper;
import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import com.golden.website.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/12/19.
 */
@SuppressWarnings("ALL")
@Api(value = "ManageRouterController", description = "模块管理后台路由控制")
@Controller
@RequestMapping("/")
public class ManageRouterController {

    @Autowired
    ManageService manageService;
    @Autowired
    WebsiteUserMapper websiteUserMapper;
    @Autowired
    WebsiteProductbuyinfoMapper websiteProductbuyinfoMapper;
    @Autowired
    WebsiteOrderMapper websiteOrderMapper;
    @Autowired
    UserService userService;


    //----------START--------轮播图---------------------------
    @ApiOperation(value="获取轮播图管理页面所有展示数据", notes="获取轮播图管理页面所有展示数据")
    @RequestMapping(value = "/lunbotu",method = RequestMethod.GET)
    public String getAllLunbotu(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteLunbotu> list = manageService.getAllOrderASCPaging(request);
                model.addAttribute("list", list);
                return "home/lunbotu";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //-----------END-------轮播图---------------------------

    //----------START--------我们是做什么的---------------------------
    @ApiOperation(value="获取我们是做什么的管理页面所有展示数据", notes="获取我们是做什么的管理页面所有展示数据")
    @RequestMapping(value = "/dowhat",method = RequestMethod.GET)
    public String dowhat(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteDowhat> list = manageService.getAllOrderASC_Dowhat();
                model.addAttribute("list", list);
                return "home/dowhat";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }

    //----------END--------我们是做什么的---------------------------
    //----------START--------我们的产品---------------------------
    @ApiOperation(value="获取我们的产品管理页面所有展示数据", notes="获取我们的产品管理页面所有展示数据")
    @RequestMapping(value = "/homeProduct",method = RequestMethod.GET)
    public String homeProduct(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteHomeproduct> list = manageService.getAllOrderASC_HomeProduct();
                model.addAttribute("list", list);
                return "home/homeProduct";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }

    //----------END--------我们的产品---------------------------
    //----------START--------行业案例---------------------------
    @ApiOperation(value="获取行业案例管理页面所有展示数据", notes="获取行业案例管理页面所有展示数据")
    @RequestMapping(value = "/industryCase",method = RequestMethod.GET)
    public String industryCase(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteIndustrycase> list = manageService.getAllOrderASC_IndustryCase();
                model.addAttribute("list", list);
                return "home/industryCase";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------行业案例---------------------------

    //----------START--------合作用户---------------------------
    @ApiOperation(value="获取合作用户管理页面所有展示数据", notes="获取合作用户管理页面所有展示数据")
    @RequestMapping(value = "/cooperativeUser",method = RequestMethod.GET)
    public String cooperativeUser(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteCooperativeuser> list = manageService.getAllOrderASC_CooperativeUser();
                model.addAttribute("list", list);
                return "home/cooperativeUser";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------行业案例---------------------------

    //----------START--------关于我们---------------------------
    @ApiOperation(value="获取关于我们管理页面所有展示数据", notes="获取关于我们管理页面所有展示数据")
    @RequestMapping(value = "/aboutUS",method = RequestMethod.GET)
    public String aboutUS(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteAboutus> list = manageService.getAllOrderASC_AboutUS();
                model.addAttribute("list", list);
                return "home/aboutUS";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }

    //----------END--------关于我们---------------------------
    //----------START--------庚顿信息模块管理---------------------------
    @ApiOperation(value="获取庚顿信息管理页面所有展示数据", notes="获取庚顿信息管理页面所有展示数据")
    @RequestMapping(value = "/goldenInfo",method = RequestMethod.GET)
    public String goldenInfo(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteGolden> list = manageService.getAllOrderByModuleASC();
                List<WebsiteEnum> listmenu = manageService.getAllMenu();
                List<WebsiteEnum> listmodule = manageService.getAllModule();
                model.addAttribute("list", list);
                model.addAttribute("listmenu", listmenu);
                model.addAttribute("listmodule", listmodule);
                return "home/goldenInfo";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }

    //----------END--------庚顿信息模块管理---------------------------
    //----------START--------字典管理---------------------------
    @ApiOperation(value="获取字典信息管理页面所有展示数据", notes="获取字典信息管理页面所有展示数据")
    @RequestMapping(value = "/enum",method = RequestMethod.GET)
    public String getAllEum(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteEnum> list = manageService.getAllGroupByTypeOrderByEnumkey();
                model.addAttribute("list", list);
                return "home/enum";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------字典管理---------------------------

    //----------START--------用户管理---------------------------
    @ApiOperation(value="获取用户信息管理页面所有展示数据", notes="获取用户信息管理页面所有展示数据")
    @RequestMapping(value = "/userManage",method = RequestMethod.GET)
    public String getAllUser(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteUser> list = websiteUserMapper.selectAll();
                model.addAttribute("list", list);
                return "home/userManage";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------用户管理---------------------------
    //----------START--------文件管理---------------------------
    @ApiOperation(value="获取文件信息管理页面所有展示数据", notes="获取文件信息管理页面所有展示数据")
    @RequestMapping(value = "/filemanage",method = RequestMethod.GET)
    public String filemanage(Model model,HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
               List<WebsiteUploadDetail> list = manageService.getFileUploadAllDetail();
                model.addAttribute("list", list);
                return "home/filemanage";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------文件管理---------------------------

    //----------START--------产品管理---------------------------
    @ApiOperation(value="获取产品信息管理页面所有展示数据", notes="获取产品信息管理页面所有展示数据")
    @RequestMapping(value = "/productmanage",method = RequestMethod.GET)
    public String productmanage(Model model,HttpServletRequest request){
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteProductbuyinfo> list = websiteProductbuyinfoMapper.selectAll();
                model.addAttribute("website_productbuyinfo",list);
                return "home/productmanage";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------产品管理---------------------------

    //----------START--------订单管理---------------------------
    @ApiOperation(value="获取订单管理页面所有订单数据", notes="获取订单管理页面所有订单数据")
    @RequestMapping(value = "/orderManage",method = RequestMethod.GET)
    public String orderManage(Model model,HttpServletRequest request){
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if(resultInfo == null){
            if(userService.getRoleByLoginusername(request).getRole().equals("1")){//管理员登录具有权限操作
                List<WebsiteOrder> list = websiteOrderMapper.selectAll();
                model.addAttribute("website_order",list);
                return "home/orderManage";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }
    //----------END--------订单管理---------------------------
}
