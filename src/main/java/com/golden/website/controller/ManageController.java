package com.golden.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ManageController {
    @RequestMapping("/manage")
    public String manage(Model model){
        return "manage";
    }
    @RequestMapping("/manageContent_Right")
    public String manageContent_Right(){
        return "manageContent_Right";
    }
    @RequestMapping("/manageContent_Right2")
    public String manageContent_Right2(){
        return "manageContent_Right2";
    }
}
