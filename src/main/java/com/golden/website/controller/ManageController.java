package com.golden.website.controller;

import com.golden.website.dataobject.WebsiteProductbuyinfo;
import com.golden.website.server.ManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Api(value = "ManageController", description = "模块管理后台接口")
@RestController
@RequestMapping("/")
public class ManageController {
    @Autowired
    ManageService manageService;

    //------------START--------------轮播图的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加轮播图信息", notes="添加轮播图信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "name", value = "轮播图名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "url", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "link", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "图片轮播顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addLunbotu",method = RequestMethod.POST)
    public String addLunbotu(HttpServletRequest request) {
        return manageService.addLunbotu(request);
    }

    @ApiOperation(value="根据id删除轮播图信息", notes="根据id删除轮播图信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "轮播图id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteLunbotuById",method = RequestMethod.POST)
    public String deleteLunbotuById(HttpServletRequest request) {
        return manageService.deleteLunbotuById(request);
    }
    @ApiOperation(value="根据id获取轮播图信息", notes="根据id获取轮播图信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "轮播图id", required = true, dataType = "String")
    @RequestMapping(value = "/getLunbotuById",method = RequestMethod.POST)
    public String getLunbotuById(HttpServletRequest request) {
        return manageService.getLunbotuById(request);
    }
    @ApiOperation(value="根据id修改轮播图信息", notes="根据id修改轮播图信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "轮播图id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "name", value = "轮播图名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "url", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "link", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "图片轮播顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editLunbotu",method = RequestMethod.POST)
    public String editLunbotu(HttpServletRequest request) {
        return manageService.editLunbotu(request);
    }

    //-------------END--------------轮播图的增加、删除、修改、查询--------------------------
    //------------START--------------"我们是做什么的"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加我们是做什么的信息", notes="添加我们是做什么的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "iconUrl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefUrl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addDowhat",method = RequestMethod.POST)
    public String addDowhat(HttpServletRequest request) {
        return manageService.addDowhat(request);
    }
    @ApiOperation(value="根据id删除我们是做什么的信息", notes="根据id删除我们是做什么的信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "我们是做什么的信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteDowhatById",method = RequestMethod.POST)
    public String deleteDowhatById(HttpServletRequest request) {
        return manageService.deleteDowhatById(request);
    }

    @ApiOperation(value="根据id获取我们是做什么的信息", notes="根据id获取我们是做什么的信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "我们是做什么的id", required = true, dataType = "String")
    @RequestMapping(value = "/getDowhatById",method = RequestMethod.POST)
    public String getDowhatById(HttpServletRequest request) {
        return manageService.getDowhatById(request);
    }
    @ApiOperation(value="根据id修改我们是做什么的信息", notes="根据id修改我们是做什么的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "我们是做什么的id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "iconUrl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefUrl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editDowhat",method = RequestMethod.POST)
    public String editDowhat(HttpServletRequest request) {
        return manageService.editDowhat(request);
    }

    //-------------END--------------"我们是做什么的"的增加、删除、修改、查询--------------------------
    //------------START--------------"我们的产品"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加我们的产品信息", notes="添加我们的产品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefurl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addHomeProduct",method = RequestMethod.POST)
    public String addHomeProduct(HttpServletRequest request) {
        return manageService.addHomeProduct(request);
    }
    @ApiOperation(value="根据id删除我们的产品信息", notes="根据id删除我们的产品信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "我们的产品信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteHomeProductById",method = RequestMethod.POST)
    public String deleteHomeProductById(HttpServletRequest request) {
        return manageService.deleteHomeProductById(request);
    }
    @ApiOperation(value="根据id获取我们的产品信息", notes="根据id获取我们的产品信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "我们的产品id", required = true, dataType = "String")
    @RequestMapping(value = "/getHomeProductById",method = RequestMethod.POST)
    public String getHomeProductById(HttpServletRequest request) {
        return manageService.getHomeProductById(request);
    }
    @ApiOperation(value="根据id修改我们的产品信息", notes="根据id修改我们的产品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "我们的产品id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefurl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editHomeProduct",method = RequestMethod.POST)
    public String editHomeProduct(HttpServletRequest request) {
        return manageService.editHomeProduct(request);
    }

    //-------------END--------------"我们的产品"的增加、删除、修改、查询--------------------------
    //------------START--------------"行业案例"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加行业案例信息", notes="添加行业案例信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefurl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addIndustryCase",method = RequestMethod.POST)
    public String addIndustryCase(HttpServletRequest request) {
        return manageService.addIndustryCase(request);
    }

    @ApiOperation(value="根据id删除行业案例信息", notes="根据id删除行业案例信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "行业案例信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteIndustryCaseById",method = RequestMethod.POST)
    public String deleteIndustryCaseById(HttpServletRequest request) {
        return manageService.deleteIndustryCaseById(request);
    }
    @ApiOperation(value="根据id获取行业案例信息", notes="根据id获取行业案例信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "行业案例id", required = true, dataType = "String")
    @RequestMapping(value = "/getIndustryCaseById",method = RequestMethod.POST)
    public String getIndustryCaseById(HttpServletRequest request) {
        return manageService.getIndustryCaseById(request);
    }
    @ApiOperation(value="根据id修改行业案例信息", notes="根据id修改行业案例信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "我们的产品id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "hrefurl", value = "点击图片跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editIndustryCase",method = RequestMethod.POST)
    public String editIndustryCase(HttpServletRequest request) {
        return manageService.editIndustryCase(request);
    }
    //-------------END--------------"行业案例"的增加、删除、修改、查询--------------------------

    //------------START--------------"合作用户"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加合作用户信息", notes="添加合作用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "图片轮播顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addCooperativeUser",method = RequestMethod.POST)
    public String addCooperativeUser(HttpServletRequest request) {
        return manageService.addCooperativeUser(request);
    }
    @ApiOperation(value="根据id删除合作用户信息", notes="根据id删除合作用户信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "合作用户信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteCooperativeUserById",method = RequestMethod.POST)
    public String deleteCooperativeUserById(HttpServletRequest request) {
        return manageService.deleteCooperativeUserById(request);
    }
    @ApiOperation(value="根据id获取合作用户信息", notes="根据id获取合作用户信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "合作用户id", required = true, dataType = "String")
    @RequestMapping(value = "/getCooperativeUserById",method = RequestMethod.POST)
    public String getCooperativeUserById(HttpServletRequest request) {
        return manageService.getCooperativeUserById(request);
    }
    @ApiOperation(value="根据id修改合作用户信息", notes="根据id修改合作用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "合作用户id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editCooperativeUser",method = RequestMethod.POST)
    public String editCooperativeUser(HttpServletRequest request) {
        return manageService.editCooperativeUser(request);
    }
    //-------------END--------------"合作用户"的增加、删除、修改、查询--------------------------

    //------------START--------------"关于我们"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加关于我们信息", notes="添加关于我们信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容简介", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "introduction", value = "简介跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "honor", value = "荣誉跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "culture", value = "文化跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "course", value = "历程跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "图片展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/addAboutUS",method = RequestMethod.POST)
    public String addAboutUS(HttpServletRequest request) {
        return manageService.addAboutUS(request);
    }
    @ApiOperation(value="根据id删除关于我们信息", notes="根据id删除关于我们信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "关于我们信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteAboutUSById",method = RequestMethod.POST)
    public String deleteAboutUSById(HttpServletRequest request) {
        return manageService.deleteAboutUSById(request);
    }
    @ApiOperation(value="根据id获取关于我们信息", notes="根据id获取关于我们信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "关于我们id", required = true, dataType = "String")
    @RequestMapping(value = "/getAboutUSById",method = RequestMethod.POST)
    public String getAboutUSById(HttpServletRequest request) {
        return manageService.getAboutUSById(request);
    }
    @ApiOperation(value="根据id修改关于我们信息", notes="根据id修改关于我们信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "关于我们id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容简介", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "introduction", value = "简介跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "honor", value = "荣誉跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "culture", value = "文化跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "course", value = "历程跳转地址", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "图片展示顺序", required = true, dataType = "Int")})
    @RequestMapping(value = "/editAboutUS",method = RequestMethod.POST)
    public String editAboutUS(HttpServletRequest request) {
        return manageService.editAboutUS(request);
    }
    //-------------END--------------"关于我们"的增加、删除、修改、查询--------------------------

    //------------START--------------"庚顿信息模块管理"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加庚顿信息信息", notes="添加庚顿信息信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "menu", value = "所属菜单", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "module", value = "所属模块", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String")})
    @RequestMapping(value = "/addGoldenInfo",method = RequestMethod.POST)
    public String addGoldenInfo(HttpServletRequest request) {
        return manageService.addGoldenInfo(request);
    }
    @ApiOperation(value="根据id删除庚顿信息", notes="根据id删除庚顿信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "庚顿信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteGoldenInfoById",method = RequestMethod.POST)
    public String deleteGoldenInfoById(HttpServletRequest request) {
        return manageService.deleteGoldenInfoById(request);
    }
    @ApiOperation(value="根据id获取关于庚顿信息", notes="根据id获取庚顿信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "庚顿信息id", required = true, dataType = "String")
    @RequestMapping(value = "/getGoldenInfoById",method = RequestMethod.POST)
    public String getGoldenInfoById(HttpServletRequest request) {
        return manageService.getGoldenInfoById(request);
    }
    @ApiOperation(value="根据id修改庚顿信息", notes="根据id修改庚顿信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "庚顿信息id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "menu", value = "所属菜单", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "module", value = "所属模块", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgurl", value = "图片地址", required = true, dataType = "String")})
    @RequestMapping(value = "/editGoldenInfo",method = RequestMethod.POST)
    public String editGoldenInfo(HttpServletRequest request) {
        return manageService.editGoldenInfo(request);
    }

    //-------------END--------------"庚顿信息模块管理"的增加、删除、修改、查询--------------------------
    //------------START--------------"字典管理"的增加、删除、修改、查询--------------------------
    @ApiOperation(value="添加字典信息", notes="添加字典信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "enumkey", value = "字典key", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "enumvalue", value = "字典", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "type", value = "类型", required = true, dataType = "Int")})
    @RequestMapping(value = "/addEnum",method = RequestMethod.POST)
    public String addEnum(HttpServletRequest request) {
        return manageService.addEnum(request);
    }
    @ApiOperation(value="根据id删除字典信息", notes="根据id删除字典信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "字典信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteEnumById",method = RequestMethod.POST)
    public String deleteEnumById(HttpServletRequest request) {
        return manageService.deleteEnumById(request);
    }
    @ApiOperation(value="根据id获取字典信息", notes="根据id字典信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "字典信息id", required = true, dataType = "String")
    @RequestMapping(value = "/getEnumById",method = RequestMethod.POST)
    public String getEnumById(HttpServletRequest request) {
        return manageService.getEnumById(request);
    }
    @ApiOperation(value="根据id修改字典信息", notes="根据id修改字典信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "字典信息id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "enumkey", value = "字典key", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "enumvalue", value = "字典", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "type", value = "类型", required = true, dataType = "Int")})
    @RequestMapping(value = "/editEnum",method = RequestMethod.POST)
    public String editEnum(HttpServletRequest request) {
        return manageService.editEnum(request);
    }
    //-------------END--------------"字典管理"的增加、删除、修改、查询--------------------------
    //----------------START------------------产品管理-------------------------------------------------

    @ApiOperation(value="添加庚顿产品信息", notes="添加庚顿产品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgpath", value = "图片路径", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "parameter", value = "产品参数", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "price", value = "产品价格", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "details", value = "产品详情", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "notice", value = "购买须知", required = true, dataType = "String")})
    @RequestMapping(value = "/addProductInfo",method = RequestMethod.POST)
    public String addProductInfo(HttpServletRequest request){
        return manageService.addProductInfo(request);
    }
    @ApiOperation(value="根据id获取庚顿产品信息", notes="根据id获取庚顿产品信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "庚顿产品信息id", required = true, dataType = "String")
    @RequestMapping(value = "/getProductBuyInfoById",method = RequestMethod.POST)
    public WebsiteProductbuyinfo getProductBuyInfoById(HttpServletRequest request){
        return manageService.getProductBuyInfoById(request);
    }

    @ApiOperation(value="根据id删除庚顿产品信息", notes="根据id删除庚顿产品信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "庚顿产品信息id", required = true, dataType = "String")
    @RequestMapping(value = "/deleteProductInfo",method = RequestMethod.POST)
    public String deleteProductInfo(HttpServletRequest request){
        return manageService.deleteProductInfo(request).toString();
    }
    @ApiOperation(value="根据id修改庚顿产品信息", notes="根据id修改庚顿产品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "id", value = "庚顿产品信息id", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "title", value = "标题", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "content", value = "文本内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "order", value = "展示顺序", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "imgpath", value = "图片路径", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "parameter", value = "产品参数", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "price", value = "产品价格", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "details", value = "产品详情", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "notice", value = "购买须知", required = true, dataType = "String")})
    @RequestMapping(value = "/editProductInfo",method = RequestMethod.POST)
    public String editProductInfo(HttpServletRequest request){
        return manageService.editProductInfo(request).toString();
    }
    //----------------END------------------产品管理-------------------------------------------------
}
