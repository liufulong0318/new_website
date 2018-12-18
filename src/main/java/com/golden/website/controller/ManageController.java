package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteLunbotuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ManageController {
    @Autowired
    WebsiteLunbotuMapper websiteLunbotuMapper;
    @RequestMapping("/manage")
    public String manage(Model model){
        return "manage";
    }
    @RequestMapping("/addLunbotu")
    public String addLunbotu(HttpServletRequest request){
        ResultInfo resultInfo  = new ResultInfo();
        String name  = request.getParameter("name");
        String link = request.getParameter("link");
        MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
        MultipartFile multipartFile =  req.getFile("imgFile");
        String fileName = multipartFile.getName();
        System.out.println("name:"+name+", link: "+link+", fileName:"+fileName);
        resultInfo.setCode("1");
        resultInfo.setMsg("添加轮播图成功");
        return resultInfo.toString();
    }
    @RequestMapping("/lunbotu")
    public String manageContent_Right(Model model){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> m = new HashMap<String, Object>();
        m.put("id", "1");
        m.put("name", "name1");
        m.put("url", "/ssss");
        m.put("link", "sssss");
        m.put("order", "0");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("id", "2");
        m.put("name", "name1");
        m.put("url", "/ssss");
        m.put("link", "sssss");
        m.put("order", "1");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("id", "3");
        m.put("name", "name1");
        m.put("url", "/ssss");
        m.put("link", "sssss");
        m.put("order", "2");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("id", "4");
        m.put("name", "name1");
        m.put("url", "/ssss");
        m.put("link", "sssss");
        m.put("order", "3");
        list.add(m);

        m = new HashMap<String, Object>();
        m.put("id", "5");
        m.put("name", "name1");
        m.put("url", "/ssss");
        m.put("link", "sssss");
        m.put("order", "4");
        list.add(m);
        model.addAttribute("list",list);
        return "home/lunbotu";
    }
    @RequestMapping("/manageContent_Right2")
    public String manageContent_Right2(){
        return "home/zuoshenme";
    }
}
