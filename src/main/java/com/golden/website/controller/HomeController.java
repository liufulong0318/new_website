package com.golden.website.controller;

import com.golden.website.commons.ListUtils;
import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import com.golden.website.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@Api(value = "HomeController", description = "获取首页展示信息接口")
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ManageService manageService;
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取首页模块展示信息", notes = "获取首页模块展示信息")
    @RequestMapping(value = {"home", ""}, method = RequestMethod.GET)
    public String home(Model model) {
        findHomeData(model);
        return "home";
    }

    @ApiOperation(value = "后台管理控制台", notes = "后台管理控制台")
    @RequestMapping(value = "manage", method = RequestMethod.GET)
    public String manage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("loginusername") != null) {
            String role = session.getAttribute("role").toString();
            if (role.equals("1")) {
                return "manage";
            } else {
                findHomeData(model);
                return "home";
            }
        } else {
            findHomeData(model);
            return "home";
        }
    }

    @ApiOperation(value = "获取软件产品模块展示信息", notes = "获取软件产品模块展示信息")
    @RequestMapping(value = "product", method = RequestMethod.GET)
    public String product(Model model) {
        List<List<WebsiteGolden>> list = new ArrayList<List<WebsiteGolden>>();
        List<WebsiteGolden> list_1 = manageService.selectAllByMenu1();
        List<WebsiteGolden> list_2 = manageService.selectAllByMenu2();
        List<WebsiteGolden> list_3 = manageService.selectAllByMenu3();
        list.add(list_1);
        list.add(list_2);
        list.add(list_3);
        model.addAttribute("list_1", list_1);
        model.addAttribute("list_2", list_2);
        model.addAttribute("list_3", list_3);
        model.addAttribute("list", list);
        return "product";
    }

    @ApiOperation(value = "获取客户案例模块展示信息", notes = "获取客户案例模块展示信息")
    @RequestMapping(value = "customer", method = RequestMethod.GET)
    public String customer(Model model) {
        List<WebsiteGolden> list = manageService.selectAllByMenu4();
        model.addAttribute("list", list);
        return "customer";
    }

    @ApiOperation(value = "获取行业案例模块展示信息", notes = "获取行业案例模块展示信息")
    @RequestMapping(value = "solution", method = RequestMethod.GET)
    public String solution(Model model) {
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list", list);
        return "solution";
    }

    @ApiOperation(value = "获取行业案例模块详情展示信息", notes = "获取行业案例模块详情展示信息")
    @RequestMapping(value = "solutionDetails", method = RequestMethod.GET)
    public String solutionDetails(Model model, String id) {
        List<WebsiteGolden> list = manageService.selectAllByMenu5();
        model.addAttribute("list", list);
        model.addAttribute("id", id);
        return "solutionDetails";
    }

    @ApiOperation(value = "获取关于庚顿模块展示信息", notes = "获取关于庚顿模块展示信息")
    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String aboutContent(Model model, String id) {
        List<WebsiteGolden> list = manageService.selectAllByMenu6();
        model.addAttribute("list", list);
        model.addAttribute("id", id);
        return "about";
    }

    @ApiOperation(value = "获取产品购买模块展示信息", notes = "获取产品购买模块展示信息")
    @RequestMapping(value = "purchase", method = RequestMethod.GET)
    public String purchase(Model model) {
        List<WebsiteProductbuyinfo> list = manageService.selectProductInfoList();
        model.addAttribute("list", list);
        return "purchase";
    }

    @ApiOperation(value = "获取资料下载模块展示信息", notes = "获取资料下载模块展示信息")
    @RequestMapping(value = "download", method = RequestMethod.GET)
    public String download(Model model) {
        List<WebsiteUploadDetail> list = manageService.getFileUploadAllDetail();
        model.addAttribute("list", list);
        return "download";
    }

    @ApiOperation(value = "登出操作", notes = "登出操作")
    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public String logout(Model model, HttpServletRequest request) throws IOException {
        userService.logout(request);
        findHomeData(model);
        return "home";
    }

    @ApiOperation(value = "获取我的信息模块展示信息", notes = "获取我的信息模块展示信息")
    @RequestMapping(value = "myInfo", method = RequestMethod.GET)
    public String myInfo(Model model, HttpServletRequest request) {
        WebsiteUser websiteUser = userService.getInfoByLoginusername(request);
        WebsiteInvoice websiteInvoice = userService.getInvoiceByLoginusername(request);
        model.addAttribute("websiteUser", websiteUser);
        model.addAttribute("websiteInvoice", websiteInvoice);
        if (request.getSession().getAttribute("loginusername") != null) {
            return "myInfo";
        } else {
            findHomeData(model);
            return "home";
        }
    }

    @ApiOperation(value = "获取购买页面模块展示信息", notes = "获取购买页面模块展示信息")
    @RequestMapping(value = "buyPage", method = RequestMethod.GET)
    public String buyPage(Model model, String id) {
        WebsiteProductbuyinfo wpbi = manageService.selectProductInfoById(id);
        StringBuffer sb = new StringBuffer();
        List<String> list = new ArrayList();
        Document doc = Jsoup.parse(wpbi.getPrice());
        Elements rows = doc.select("table").get(0).select("tbody tr");
        if (rows.size() == 1) {
            System.out.println("没有结果");
        } else {
            for (int i = 1; i < rows.size(); i++) {

                Element row = rows.get(i);
                System.out.println("规格:" + row.select("td").get(0).text());
                System.out.println("首次购买价(元):" + row.select("td").get(2).text());
                sb.append("<option value=\"").append(i).append("\">").append(row.select("td").get(0).text()).append("</option>");
                list.add(row.select("td").get(2).text());
            }
        }
        model.addAttribute("wpbi", wpbi);
        model.addAttribute("op", sb.toString());
        model.addAttribute("map", list);
        return "buyPage";
    }

    /**
     * 公共获取首页数据
     *
     * @param model
     */
    public void findHomeData(Model model) {
        List<WebsiteLunbotu> list = manageService.getAllOrderASC();
        List<WebsiteDowhat> listDowhat = manageService.getAllOrderASC_Dowhat();
        WebsiteHomeproduct WebsiteHomeproduct_top1 = manageService.getHomeProductTop_1();
        WebsiteHomeproduct WebsiteHomeproduct_top2 = manageService.getHomeProductTop_2();
        List<WebsiteIndustrycase> listIndustrycase = manageService.getAllOrderASC_IndustryCase();
        List<WebsiteCooperativeuser> listCooperativeuser_1_12 = manageService.getAllOrderASC_CooperativeUser_1_12();
        List<WebsiteCooperativeuser> listCooperativeuser_13_24 = manageService.getAllOrderASC_CooperativeUser_13_24();
        List<WebsiteCooperativeuser> listCooperativeuser_25_36 = manageService.getAllOrderASC_CooperativeUser_25_36();
        WebsiteAboutus websiteAboutus = manageService.getWebsiteAboutusTopOne();
        List<String> goldendynamic = manageService.getGoldenDynamicTop3();
        List<String> goldenshare = manageService.getGoldenShareTop3();
        model.addAttribute("lunbotu", list);//轮播图
        model.addAttribute("dowhat", listDowhat);//我们是做什么的
        model.addAttribute("top1", WebsiteHomeproduct_top1);//我们的产品一
        model.addAttribute("top2", WebsiteHomeproduct_top2);//我们的产品二
        model.addAttribute("IC", listIndustrycase);//行业案例
        model.addAttribute("listCU_1_12", listCooperativeuser_1_12);//合作用户轮播第一张
        model.addAttribute("listCU_13_24", listCooperativeuser_13_24);//合作用户轮播第二张
        model.addAttribute("listCU_25_36", listCooperativeuser_25_36);//合作用户第三张
        model.addAttribute("websiteAboutus", websiteAboutus);//关于我们
        model.addAttribute("goldendynamic", goldendynamic);//庚顿动态top3
        model.addAttribute("goldenshare", goldenshare);//庚顿分享top3
    }

    @ApiOperation(value = "获取我的订单模块展示信息", notes = "获取我的订单模块展示信息")
    @RequestMapping(value = "myOrder", method = RequestMethod.GET)
    public String myOrder(Model model, HttpServletRequest request) {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if (resultInfo != null) {//未登录，返回首页
            findHomeData(model);
            return "home";
        }
        if (request.getSession().getAttribute("loginusername") != null) {
            WebsiteUser websiteUser = userService.getInfoByLoginusername(request);
            List<WebsiteOrder> orderList = userService.getOrderByUserId(websiteUser.getId());
            model.addAttribute("orderList", orderList);
            return "myOrder";
        } else {
            findHomeData(model);
            return "home";
        }
    }


}
