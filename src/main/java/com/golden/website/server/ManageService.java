package com.golden.website.server;



import com.golden.website.dataobject.WebsiteLunbotu;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ManageService {
    String addLunbotu(HttpServletRequest request);
    List<WebsiteLunbotu> getAllOrderASC();
    String deleteLunbotuById(HttpServletRequest request);
    String getLunbotuById(HttpServletRequest request);
}
