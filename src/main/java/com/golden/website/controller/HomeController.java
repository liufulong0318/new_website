package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ManageService manageService;
    @Autowired
    UserService userService;
    @RequestMapping("home")
    public String home(Model model) {
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        List<WebsiteDowhat> listDowhat = manageService.getAllOrderASC_Dowhat();
        WebsiteHomeproduct WebsiteHomeproduct_top1 = manageService.getHomeProductTop_1();
        WebsiteHomeproduct WebsiteHomeproduct_top2 = manageService.getHomeProductTop_2();
        List<WebsiteIndustrycase> listIndustrycase = manageService.getAllOrderASC_IndustryCase();
        List<WebsiteCooperativeuser> listCooperativeuser_1_12 = manageService.getAllOrderASC_CooperativeUser_1_12();
        List<WebsiteCooperativeuser> listCooperativeuser_13_24 = manageService.getAllOrderASC_CooperativeUser_13_24();
        List<WebsiteCooperativeuser> listCooperativeuser_25_36 = manageService.getAllOrderASC_CooperativeUser_25_36();
        WebsiteAboutus websiteAboutus = manageService.getWebsiteAboutusTopOne();
        List<String> goldendynamic = manageService.getGoldenDynamicTop3();
        List<String> goldenshare = manageService.getGoldenShareTop3();
        model.addAttribute("lunbotu", list);//轮播图
        model.addAttribute("dowhat", listDowhat);//我们是做什么的
        model.addAttribute("top1", WebsiteHomeproduct_top1);//我们的产品一
        model.addAttribute("top2", WebsiteHomeproduct_top2);//我们的产品二
        model.addAttribute("IC", listIndustrycase);//行业案例
        model.addAttribute("listCU_1_12", listCooperativeuser_1_12);//合作用户轮播第一张
        model.addAttribute("listCU_13_24", listCooperativeuser_13_24);//合作用户轮播第二张
        model.addAttribute("listCU_25_36", listCooperativeuser_25_36);//合作用户第三张
        model.addAttribute("websiteAboutus", websiteAboutus);//关于我们
        model.addAttribute("goldendynamic", goldendynamic);//庚顿动态top3
        model.addAttribute("goldenshare", goldenshare);//庚顿分享top3
//        model.addAttribute("token","aaa");//测试
//        model.addAttribute("loginuusername","forlong");//测试
        return "home";
    }

    @RequestMapping("")
    public String home_(Model model) {
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        List<WebsiteDowhat> listDowhat = manageService.getAllOrderASC_Dowhat();
        WebsiteHomeproduct WebsiteHomeproduct_top1 = manageService.getHomeProductTop_1();
        WebsiteHomeproduct WebsiteHomeproduct_top2 = manageService.getHomeProductTop_2();
        List<WebsiteIndustrycase> listIndustrycase = manageService.getAllOrderASC_IndustryCase();
        List<WebsiteCooperativeuser> listCooperativeuser_1_12 = manageService.getAllOrderASC_CooperativeUser_1_12();
        List<WebsiteCooperativeuser> listCooperativeuser_13_24 = manageService.getAllOrderASC_CooperativeUser_13_24();
        List<WebsiteCooperativeuser> listCooperativeuser_25_36 = manageService.getAllOrderASC_CooperativeUser_25_36();
        WebsiteAboutus websiteAboutus = manageService.getWebsiteAboutusTopOne();
        List<String> goldendynamic = manageService.getGoldenDynamicTop3();
        List<String> goldenshare = manageService.getGoldenShareTop3();
        model.addAttribute("lunbotu", list);//轮播图
        model.addAttribute("dowhat", listDowhat);//我们是做什么的
        model.addAttribute("top1", WebsiteHomeproduct_top1);//我们的产品一
        model.addAttribute("top2", WebsiteHomeproduct_top2);//我们的产品二
        model.addAttribute("IC", listIndustrycase);//行业案例
        model.addAttribute("listCU_1_12", listCooperativeuser_1_12);//合作用户轮播第一张
        model.addAttribute("listCU_13_24", listCooperativeuser_13_24);//合作用户轮播第二张
        model.addAttribute("listCU_25_36", listCooperativeuser_25_36);//合作用户第三张
        model.addAttribute("websiteAboutus", websiteAboutus);//关于我们
        model.addAttribute("goldendynamic", goldendynamic);//庚顿动态top3
        model.addAttribute("goldenshare", goldenshare);//庚顿分享top3
        return "home";
    }

    @RequestMapping("manage")
    public String manage(Model model) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        if(session.getAttribute("loginusername") != null){
            String role = session.getAttribute("role").toString();
            if(role.equals("1")){
                return "manage";
            }else{
                return "error";
            }
        }else{
            return "error";
        }
    }

    @RequestMapping("product")
    public String product(Model model) {
        List<List<WebsiteGolden>> list = new ArrayList<List<WebsiteGolden>>();
        List<WebsiteGolden> list_1 = manageService.selectAllByMenu1();
        List<WebsiteGolden> list_2 = manageService.selectAllByMenu2();
        List<WebsiteGolden> list_3 = manageService.selectAllByMenu3();
        list.add(list_1);
        list.add(list_2);
        list.add(list_3);
        model.addAttribute("list_1", list_1);
        model.addAttribute("list_2", list_2);
        model.addAttribute("list_3", list_3);
        model.addAttribute("list", list);
        return "product";
    }

    @RequestMapping("customer")
    public String customer(Model model) {
        List<WebsiteGolden> list = manageService.selectAllByMenu4();
        model.addAttribute("list", list);
        return "customer";
    }

    @RequestMapping("solution")
    public String solution(Model model) {
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list", list);
        return "solution";
    }

    @RequestMapping("solutionDetails")
    public String solutionDetails(Model model, String id) {
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list", list);
        model.addAttribute("id", id);
        return "solutionDetails";
    }

    @RequestMapping("about")
    public String aboutContent(Model model, String id) {
        List<WebsiteGolden> list = manageService.selectAllByMenu6();
        model.addAttribute("list", list);
        model.addAttribute("id", id);
        return "about";
    }

    @RequestMapping("purchase")
    public String purchase(Model model) {
        return "purchase";
    }

    @RequestMapping("download")
    public String download(Model model) {
        return "download";
    }

    @RequestMapping("logout")
    public String logout(Model model,HttpServletRequest request) {
        userService.logout(request);
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        List<WebsiteDowhat> listDowhat = manageService.getAllOrderASC_Dowhat();
        WebsiteHomeproduct WebsiteHomeproduct_top1 = manageService.getHomeProductTop_1();
        WebsiteHomeproduct WebsiteHomeproduct_top2 = manageService.getHomeProductTop_2();
        List<WebsiteIndustrycase> listIndustrycase = manageService.getAllOrderASC_IndustryCase();
        List<WebsiteCooperativeuser> listCooperativeuser_1_12 = manageService.getAllOrderASC_CooperativeUser_1_12();
        List<WebsiteCooperativeuser> listCooperativeuser_13_24 = manageService.getAllOrderASC_CooperativeUser_13_24();
        List<WebsiteCooperativeuser> listCooperativeuser_25_36 = manageService.getAllOrderASC_CooperativeUser_25_36();
        WebsiteAboutus websiteAboutus = manageService.getWebsiteAboutusTopOne();
        List<String> goldendynamic = manageService.getGoldenDynamicTop3();
        List<String> goldenshare = manageService.getGoldenShareTop3();
        model.addAttribute("lunbotu", list);//轮播图
        model.addAttribute("dowhat", listDowhat);//我们是做什么的
        model.addAttribute("top1", WebsiteHomeproduct_top1);//我们的产品一
        model.addAttribute("top2", WebsiteHomeproduct_top2);//我们的产品二
        model.addAttribute("IC", listIndustrycase);//行业案例
        model.addAttribute("listCU_1_12", listCooperativeuser_1_12);//合作用户轮播第一张
        model.addAttribute("listCU_13_24", listCooperativeuser_13_24);//合作用户轮播第二张
        model.addAttribute("listCU_25_36", listCooperativeuser_25_36);//合作用户第三张
        model.addAttribute("websiteAboutus", websiteAboutus);//关于我们
        model.addAttribute("goldendynamic", goldendynamic);//庚顿动态top3
        model.addAttribute("goldenshare", goldenshare);//庚顿分享top3
        return "home";
    }
}
