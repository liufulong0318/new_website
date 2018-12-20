package com.golden.website.server;



import com.golden.website.dataobject.WebsiteDowhat;
import com.golden.website.dataobject.WebsiteLunbotu;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ManageService {
    //------------START--------------轮播图的增加、删除、修改、查询接口--------------------------
    String addLunbotu(HttpServletRequest request);
    List<WebsiteLunbotu> getAllOrderASC();
    String deleteLunbotuById(HttpServletRequest request);
    String getLunbotuById(HttpServletRequest request);
    String editLunbotu(HttpServletRequest request);
    //-------------END--------------轮播图的增加、删除、修改、查询接口--------------------------
    //------------START--------------轮播图的增加、删除、修改、查询接口--------------------------
    String addDowhat(HttpServletRequest request);
    List<WebsiteDowhat> getAllOrderASC_Dowhat();
    String deleteDowhatById(HttpServletRequest request);
    String getDowhatById(HttpServletRequest request);
    String editDowhat(HttpServletRequest request);
    //-------------END--------------轮播图的增加、删除、修改、查询接口--------------------------
}
