package com.golden.website.controller;

import com.golden.website.dataobject.WebsiteDowhat;
import com.golden.website.dataobject.WebsiteHomeproduct;
import com.golden.website.dataobject.WebsiteLunbotu;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/12/19.
 */
@Controller
@RequestMapping("/")
public class manageRouterController {

    @Autowired
    ManageService manageService;

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
}
