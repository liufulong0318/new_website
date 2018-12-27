package com.golden.website.controller;

import com.golden.website.dao.WebsiteUserMapper;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/12/19.
 */
@Controller
@RequestMapping("/")
public class ManageRouterController {

    @Autowired
    ManageService manageService;
    @Autowired
    WebsiteUserMapper websiteUserMapper;

    //----------START--------轮播图---------------------------
    @RequestMapping("/lunbotu")
    public String getAllLunbotu(Model model){
        List<WebsiteLunbotu> list =  manageService.getAllOrderASC();
        model.addAttribute("list",list);
        return "home/lunbotu";
    }
    //-----------END-------轮播图---------------------------

    //----------START--------我们是做什么的---------------------------
    @RequestMapping("/dowhat")
    public String dowhat(Model model){
        List<WebsiteDowhat> list =  manageService.getAllOrderASC_Dowhat();
        model.addAttribute("list",list);
        return "home/dowhat";
    }
    //----------END--------我们是做什么的---------------------------
    //----------START--------我们的产品---------------------------
    @RequestMapping("/homeProduct")
    public String homeProduct(Model model){
        List<WebsiteHomeproduct> list =  manageService.getAllOrderASC_HomeProduct();
        model.addAttribute("list",list);
        return "home/homeProduct";
    }
    //----------END--------我们的产品---------------------------
    //----------START--------行业案例---------------------------
    @RequestMapping("/industryCase")
    public String industryCase(Model model){
        List<WebsiteIndustrycase> list =  manageService.getAllOrderASC_IndustryCase();
        model.addAttribute("list",list);
        return "home/industryCase";
    }
    //----------END--------行业案例---------------------------

    //----------START--------合作用户---------------------------
    @RequestMapping("/cooperativeUser")
    public String cooperativeUser(Model model){
        List<WebsiteCooperativeuser> list =  manageService.getAllOrderASC_CooperativeUser();
        model.addAttribute("list",list);
        return "home/cooperativeUser";
    }
    //----------END--------行业案例---------------------------

    //----------START--------关于我们---------------------------
    @RequestMapping("/aboutUS")
    public String aboutUS(Model model){
        List<WebsiteAboutus> list =  manageService.getAllOrderASC_AboutUS();
        model.addAttribute("list",list);
        return "home/aboutUS";
    }
    //----------END--------关于我们---------------------------
    //----------START--------庚顿信息模块管理---------------------------
    @RequestMapping("/goldenInfo")
    public String goldenInfo(Model model){
        List<WebsiteGolden> list =  manageService.getAllOrderByModuleASC();
        List<WebsiteEnum> listmenu =  manageService.getAllMenu();
        List<WebsiteEnum> listmodule =  manageService.getAllModule();
        model.addAttribute("list",list);
        model.addAttribute("listmenu",listmenu);
        model.addAttribute("listmodule",listmodule);
        return "home/goldenInfo";
    }
    //----------END--------庚顿信息模块管理---------------------------
    //----------START--------字典管理---------------------------
    @RequestMapping("/enum")
    public String getAllEum(Model model){
        List<WebsiteEnum> list =  manageService.getAllGroupByTypeOrderByEnumkey();
        model.addAttribute("list",list);
        return "home/enum";
    }
    //----------END--------字典管理---------------------------

    //----------START--------用户管理---------------------------
    @RequestMapping("/userManage")
    public String getAllUser(Model model){
        List<WebsiteUser> list =  websiteUserMapper.selectAll();
        model.addAttribute("list",list);
        return "home/userManage";
    }
    //----------END--------用户管理---------------------------

}
