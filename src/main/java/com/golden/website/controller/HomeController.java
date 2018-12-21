package com.golden.website.controller;

import com.golden.website.dataobject.WebsiteDowhat;
import com.golden.website.dataobject.WebsiteHomeproduct;
import com.golden.website.dataobject.WebsiteIndustrycase;
import com.golden.website.dataobject.WebsiteLunbotu;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("lunbotu",list);
        model.addAttribute("dowhat",listDowhat);
        model.addAttribute("top1",WebsiteHomeproduct_top1);
        model.addAttribute("top2",WebsiteHomeproduct_top2);
        model.addAttribute("IC",listIndustrycase);
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

}
