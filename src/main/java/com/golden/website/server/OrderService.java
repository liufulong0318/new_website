package com.golden.website.server;

import com.golden.website.commons.ResultInfo;

import javax.servlet.http.HttpServletRequest;

public interface OrderService {
    ResultInfo addOrderInfo(HttpServletRequest request);
}
