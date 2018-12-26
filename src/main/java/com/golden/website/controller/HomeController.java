package com.golden.website.controller;

import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ManageService manageService;
    @RequestMapping("home")
    public String home(Model model){
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        List<WebsiteDowhat> listDowhat = manageService.getAllOrderASC_Dowhat();
        WebsiteHomeproduct WebsiteHomeproduct_top1 = manageService.getHomeProductTop_1();
        WebsiteHomeproduct WebsiteHomeproduct_top2 = manageService.getHomeProductTop_2();
        List<WebsiteIndustrycase> listIndustrycase =  manageService.getAllOrderASC_IndustryCase();
        List<WebsiteCooperativeuser> listCooperativeuser_1_12 =  manageService.getAllOrderASC_CooperativeUser_1_12();
        List<WebsiteCooperativeuser> listCooperativeuser_13_24 =  manageService.getAllOrderASC_CooperativeUser_13_24();
        List<WebsiteCooperativeuser> listCooperativeuser_25_36 =  manageService.getAllOrderASC_CooperativeUser_25_36();
        WebsiteAboutus websiteAboutus =  manageService.getWebsiteAboutusTopOne();
        model.addAttribute("lunbotu",list);
        model.addAttribute("dowhat",listDowhat);
        model.addAttribute("top1",WebsiteHomeproduct_top1);
        model.addAttribute("top2",WebsiteHomeproduct_top2);
        model.addAttribute("IC",listIndustrycase);
        model.addAttribute("listCU_1_12",listCooperativeuser_1_12);
        model.addAttribute("listCU_13_24",listCooperativeuser_13_24);
        model.addAttribute("listCU_25_36",listCooperativeuser_25_36);
        model.addAttribute("websiteAboutus",websiteAboutus);
        return "home";
    }
    @RequestMapping("")
    public String home_(Model model){
        model.addAttribute("token", UUID.randomUUID());
        return "home";
    }
    @RequestMapping("manage")
    public String manage(Model model){
        return "manage";
    }

    @RequestMapping("product")
    public String product(Model model){
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
        model.addAttribute("list",list);
        return "product";
    }
    @RequestMapping("customer")
    public String customer(Model model){
        List<WebsiteGolden> list = manageService.selectAllByMenu4();
        model.addAttribute("list",list);
        return "customer";
    }
    @RequestMapping("solution")
    public String solution(Model model){
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list",list);
        return "solution";
    }

    @RequestMapping("solutionDetails")
    public String solutionDetails(Model model,String id){
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list",list);
        model.addAttribute("id",id);
        return "solutionDetails";
    }
    @RequestMapping("about")
    public String aboutContent(Model model, String id) {
        List<WebsiteGolden> list = manageService.selectAllByMenu6();
        model.addAttribute("list",list);
        model.addAttribute("id",id);
        return "about";
    }
}
