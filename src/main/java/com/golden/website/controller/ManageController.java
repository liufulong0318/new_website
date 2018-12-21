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
    //------------START--------------"我们的产品"的增加、删除、修改、查询--------------------------
    @RequestMapping("/addHomeProduct")
    public String addHomeProduct(HttpServletRequest request){
        return manageService.addHomeProduct(request);
    }
    @RequestMapping("/deleteHomeProductById")
    public String deleteHomeProductById(HttpServletRequest request){
        return manageService.deleteHomeProductById(request);
    }
    @RequestMapping("/getHomeProductById")
    public String getHomeProductById(HttpServletRequest request){
        return manageService.getHomeProductById(request);
    }
    @RequestMapping("/editHomeProduct")
    public String editHomeProduct(HttpServletRequest request){
        return manageService.editHomeProduct(request);
    }
    //-------------END--------------"我们的产品"的增加、删除、修改、查询--------------------------
    //------------START--------------"行业案例"的增加、删除、修改、查询--------------------------
    @RequestMapping("/addIndustryCase")
    public String addIndustryCase(HttpServletRequest request){
        return manageService.addIndustryCase(request);
    }
    @RequestMapping("/deleteIndustryCaseById")
    public String deleteIndustryCaseById(HttpServletRequest request){
        return manageService.deleteIndustryCaseById(request);
    }
    @RequestMapping("/getIndustryCaseById")
    public String getIndustryCaseById(HttpServletRequest request){
        return manageService.getIndustryCaseById(request);
    }
    @RequestMapping("/editIndustryCase")
    public String editIndustryCase(HttpServletRequest request){
        return manageService.editIndustryCase(request);
    }
    //-------------END--------------"行业案例"的增加、删除、修改、查询--------------------------
}
