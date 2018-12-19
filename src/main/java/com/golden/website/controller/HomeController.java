package com.golden.website.controller;

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
        List<WebsiteLunbotu> list =  manageService.getAllOrderASC();
        model.addAttribute("lunbotu",list);
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
