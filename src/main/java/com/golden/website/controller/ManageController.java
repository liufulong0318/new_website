package com.golden.website.controller;

import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class ManageController {
    @Autowired
    ManageService manageService;
    //------------START--------------轮播图的增加、删除、修改、查询--------------------------
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
    @RequestMapping("/editLunbotu")
    public String editLunbotu(HttpServletRequest request){
        return manageService.editLunbotu(request);
    }
    //-------------END--------------轮播图的增加、删除、修改、查询--------------------------
    //------------START--------------"我们是做什么的"的增加、删除、修改、查询--------------------------
    @RequestMapping("/addDowhat")
    public String addDowhat(HttpServletRequest request){
        return manageService.addDowhat(request);
    }
    @RequestMapping("/deleteDowhatById")
    public String deleteDowhatById(HttpServletRequest request){
        return manageService.deleteDowhatById(request);
    }
    @RequestMapping("/getDowhatById")
    public String getDowhatById(HttpServletRequest request){
        return manageService.getDowhatById(request);
    }
    @RequestMapping("/editDowhat")
    public String editDowhat(HttpServletRequest request){
        return manageService.editDowhat(request);
    }
    //-------------END--------------"我们是做什么的"的增加、删除、修改、查询--------------------------


}
