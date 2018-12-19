package com.golden.website.controller;

import com.golden.website.dao.WebsiteLunbotuMapper;
import com.golden.website.dataobject.WebsiteLunbotu;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/19.
 */
@Controller
@RequestMapping("/")
public class manageRouterController {

    @Autowired
    ManageService manageService;

    @RequestMapping("/lunbotu")
    public String getAllLunbotu(Model model){
        List<WebsiteLunbotu> list =  manageService.getAllOrderASC();
        model.addAttribute("list",list);
        return "home/lunbotu";
    }
    @RequestMapping("/manageContent_Right2")
    public String manageContent_Right2(){
        return "home/zuoshenme";
    }
}
