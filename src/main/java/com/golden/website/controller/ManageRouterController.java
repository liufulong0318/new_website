package com.golden.website.controller;

import com.golden.website.dao.WebsiteProductbuyinfoMapper;
import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/12/19.
 */
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

    //----------START--------轮播图---------------------------
    @ApiOperation(value="获取轮播图管理页面所有展示数据", notes="获取轮播图管理页面所有展示数据")
    @RequestMapping(value = "/lunbotu",method = RequestMethod.GET)
    public String getAllLunbotu(Model model) {
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        model.addAttribute("list", list);
        return "home/lunbotu";
    }
    //-----------END-------轮播图---------------------------

    //----------START--------我们是做什么的---------------------------
    @ApiOperation(value="获取我们是做什么的管理页面所有展示数据", notes="获取我们是做什么的管理页面所有展示数据")
    @RequestMapping(value = "/dowhat",method = RequestMethod.GET)
    public String dowhat(Model model) {
        List<WebsiteDowhat> list = manageService.getAllOrderASC_Dowhat();
        model.addAttribute("list", list);
        return "home/dowhat";
    }

    //----------END--------我们是做什么的---------------------------
    //----------START--------我们的产品---------------------------
    @ApiOperation(value="获取我们的产品管理页面所有展示数据", notes="获取我们的产品管理页面所有展示数据")
    @RequestMapping(value = "/homeProduct",method = RequestMethod.GET)
    public String homeProduct(Model model) {
        List<WebsiteHomeproduct> list = manageService.getAllOrderASC_HomeProduct();
        model.addAttribute("list", list);
        return "home/homeProduct";
    }

    //----------END--------我们的产品---------------------------
    //----------START--------行业案例---------------------------
    @ApiOperation(value="获取行业案例管理页面所有展示数据", notes="获取行业案例管理页面所有展示数据")
    @RequestMapping(value = "/industryCase",method = RequestMethod.GET)
    public String industryCase(Model model) {
        List<WebsiteIndustrycase> list = manageService.getAllOrderASC_IndustryCase();
        model.addAttribute("list", list);
        return "home/industryCase";
    }
    //----------END--------行业案例---------------------------

    //----------START--------合作用户---------------------------
    @ApiOperation(value="获取合作用户管理页面所有展示数据", notes="获取合作用户管理页面所有展示数据")
    @RequestMapping(value = "/cooperativeUser",method = RequestMethod.GET)
    public String cooperativeUser(Model model) {
        List<WebsiteCooperativeuser> list = manageService.getAllOrderASC_CooperativeUser();
        model.addAttribute("list", list);
        return "home/cooperativeUser";
    }
    //----------END--------行业案例---------------------------

    //----------START--------关于我们---------------------------
    @ApiOperation(value="获取关于我们管理页面所有展示数据", notes="获取关于我们管理页面所有展示数据")
    @RequestMapping(value = "/aboutUS",method = RequestMethod.GET)
    public String aboutUS(Model model) {
        List<WebsiteAboutus> list = manageService.getAllOrderASC_AboutUS();
        model.addAttribute("list", list);
        return "home/aboutUS";
    }

    //----------END--------关于我们---------------------------
    //----------START--------庚顿信息模块管理---------------------------
    @ApiOperation(value="获取庚顿信息管理页面所有展示数据", notes="获取庚顿信息管理页面所有展示数据")
    @RequestMapping(value = "/goldenInfo",method = RequestMethod.GET)
    public String goldenInfo(Model model) {
        List<WebsiteGolden> list = manageService.getAllOrderByModuleASC();
        List<WebsiteEnum> listmenu = manageService.getAllMenu();
        List<WebsiteEnum> listmodule = manageService.getAllModule();
        model.addAttribute("list", list);
        model.addAttribute("listmenu", listmenu);
        model.addAttribute("listmodule", listmodule);
        return "home/goldenInfo";
    }

    //----------END--------庚顿信息模块管理---------------------------
    //----------START--------字典管理---------------------------
    @ApiOperation(value="获取字典信息管理页面所有展示数据", notes="获取字典信息管理页面所有展示数据")
    @RequestMapping(value = "/enum",method = RequestMethod.GET)
    public String getAllEum(Model model) {
        List<WebsiteEnum> list = manageService.getAllGroupByTypeOrderByEnumkey();
        model.addAttribute("list", list);
        return "home/enum";
    }
    //----------END--------字典管理---------------------------

    //----------START--------用户管理---------------------------
    @ApiOperation(value="获取用户信息管理页面所有展示数据", notes="获取用户信息管理页面所有展示数据")
    @RequestMapping(value = "/userManage",method = RequestMethod.GET)
    public String getAllUser(Model model) {
        List<WebsiteUser> list = websiteUserMapper.selectAll();
        model.addAttribute("list", list);
        return "home/userManage";
    }
    //----------END--------用户管理---------------------------
    //----------START--------文件管理---------------------------
    @ApiOperation(value="获取文件信息管理页面所有展示数据", notes="获取文件信息管理页面所有展示数据")
    @RequestMapping(value = "/filemanage",method = RequestMethod.GET)
    public String filemanage(Model model) {
//        List<WebsiteUser> list = websiteUserMapper.selectAll();
//        model.addAttribute("list", list);
        return "home/filemanage";
    }
    //----------END--------文件管理---------------------------

    //----------START--------产品管理---------------------------
    @ApiOperation(value="获取产品信息管理页面所有展示数据", notes="获取产品信息管理页面所有展示数据")
    @RequestMapping(value = "/productmanage",method = RequestMethod.GET)
    public String productmanage(Model model){
        List<WebsiteProductbuyinfo> list = websiteProductbuyinfoMapper.selectAll();
        model.addAttribute("website_productbuyinfo",list);
        return "home/productmanage";
    }
    //----------END--------产品管理---------------------------
}
