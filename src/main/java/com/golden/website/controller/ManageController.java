package com.golden.website.controller;

import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
;

@RestController
@RequestMapping("/")
public class ManageController {
    @Autowired
    ManageService manageService;

    @RequestMapping("/addLunbotu")
    public String addLunbotu(HttpServletRequest request){
        return manageService.addLunbotu(request);
    }
    @RequestMapping("/deleteLunbotuById")
    public String deleteLunbotuById(HttpServletRequest request){
        return manageService.deleteLunbotuById(request);
    }

    @RequestMapping("/getLunbotuById")
    public String getLunbotuById(HttpServletRequest request){
        return manageService.getLunbotuById(request);
    }

}
