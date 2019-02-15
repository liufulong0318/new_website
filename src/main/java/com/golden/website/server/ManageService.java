package com.golden.website.server;


import com.golden.website.dataobject.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ManageService {
    //------------START--------------轮播图的增加、删除、修改、查询接口--------------------------
    String addLunbotu(HttpServletRequest request);

    List<WebsiteLunbotu> getAllOrderASCPaging(HttpServletRequest request);

    List<WebsiteLunbotu> getAllOrderASC();
    String deleteLunbotuById(HttpServletRequest request);

    String getLunbotuById(HttpServletRequest request);

    String editLunbotu(HttpServletRequest request);

    //-------------END--------------轮播图的增加、删除、修改、查询接口--------------------------
    //------------START--------------我们是做什么的增加、删除、修改、查询接口--------------------------
    String addDowhat(HttpServletRequest request);

    List<WebsiteDowhat> getAllOrderASC_Dowhat();

    String deleteDowhatById(HttpServletRequest request);

    String getDowhatById(HttpServletRequest request);

    String editDowhat(HttpServletRequest request);

    //-------------END--------------我们是做什么增加、删除、修改、查询接口--------------------------
    //------------START--------------我们的产品增加、删除、修改、查询接口--------------------------
    String addHomeProduct(HttpServletRequest request);

    List<WebsiteHomeproduct> getAllOrderASC_HomeProduct();

    String deleteHomeProductById(HttpServletRequest request);

    String getHomeProductById(HttpServletRequest request);

    String editHomeProduct(HttpServletRequest request);

    WebsiteHomeproduct getHomeProductTop_1();

    WebsiteHomeproduct getHomeProductTop_2();

    //-------------END--------------我们的产品增加、删除、修改、查询接口--------------------------
    // ------------START--------------行业案例增加、删除、修改、查询接口--------------------------
    String addIndustryCase(HttpServletRequest request);

    List<WebsiteIndustrycase> getAllOrderASC_IndustryCase();

    String deleteIndustryCaseById(HttpServletRequest request);

    String getIndustryCaseById(HttpServletRequest request);

    String editIndustryCase(HttpServletRequest request);

    //-------------END--------------行业案例增加、删除、修改、查询接口--------------------------

    //------------START--------------合作用户增加、删除、修改、查询接口--------------------------
    String addCooperativeUser(HttpServletRequest request);

    List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser();

    List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_1_12();

    List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_13_24();

    List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_25_36();

    String deleteCooperativeUserById(HttpServletRequest request);

    String getCooperativeUserById(HttpServletRequest request);

    String editCooperativeUser(HttpServletRequest request);
    //-------------END--------------合作用户增加、删除、修改、查询接口--------------------------

    //------------START--------------关于我们增加、删除、修改、查询接口--------------------------
    String addAboutUS(HttpServletRequest request);

    List<WebsiteAboutus> getAllOrderASC_AboutUS();

    WebsiteAboutus getWebsiteAboutusTopOne();

    String deleteAboutUSById(HttpServletRequest request);

    String getAboutUSById(HttpServletRequest request);

    String editAboutUS(HttpServletRequest request);
    //-------------END--------------关于我们增加、删除、修改、查询接口--------------------------


    //------------START--------------庚顿信息模块管理增加、删除、修改、查询接口--------------------------
    String addGoldenInfo(HttpServletRequest request);

    List<WebsiteGolden> getAllOrderByModuleASC();

    WebsiteGolden getWebsiteGoldenByModule(HttpServletRequest request);

    String deleteGoldenInfoById(HttpServletRequest request);

    String getGoldenInfoById(HttpServletRequest request);

    String editGoldenInfo(HttpServletRequest request);

    //-------------END--------------庚顿信息模块管理增加、删除、修改、查询接口--------------------------
    //------------START--------------字典管理增加、删除、修改、查询接口--------------------------
    String addEnum(HttpServletRequest request);

    List<WebsiteEnum> getAllGroupByTypeOrderByEnumkey();

    List<WebsiteEnum> getWebsiteEnumByType(HttpServletRequest request);

    String deleteEnumById(HttpServletRequest request);

    String getEnumById(HttpServletRequest request);

    String editEnum(HttpServletRequest request);

    List<WebsiteEnum> getAllMenu();

    List<WebsiteEnum> getAllModule();

    //-------------END--------------字典管理管理增加、删除、修改、查询接口--------------------------
    //-------------START--------------软件产品前台页面使用的接口--------------------------
    List<WebsiteGolden> selectAllByMenu1();

    List<WebsiteGolden> selectAllByMenu2();

    List<WebsiteGolden> selectAllByMenu3();

    List<WebsiteGolden> selectAllByMenu4();

    List<WebsiteGolden> selectAllByMenu5();

    List<WebsiteGolden> selectAllByMenu6();

    //-------------END--------------软件产品前台页面使用的接口--------------------------
    //-------------START--------------首页中的庚顿动态和庚顿分享--------------------------
    List<String> getGoldenDynamicTop3();

    List<String> getGoldenShareTop3();


    //-------------END--------------首页中的庚顿动态和庚顿分享--------------------------
    String addProductInfo(HttpServletRequest request);//产品管理

    WebsiteProductbuyinfo getProductBuyInfoById(HttpServletRequest request);

    String editProductInfo(HttpServletRequest request);

    List<WebsiteProductbuyinfo> selectProductInfoList();

    WebsiteProductbuyinfo selectProductInfoById(String id);

    String deleteProductInfo(HttpServletRequest request);
}
