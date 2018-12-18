package com.golden.website.controller;

import com.golden.website.dao.WebsiteLunbotuMapper;
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
    WebsiteLunbotuMapper websiteLunbotuMapper;
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
