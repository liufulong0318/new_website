package com.golden.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("home")
    public String home(Model model){
        model.addAttribute("token", UUID.randomUUID());
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
