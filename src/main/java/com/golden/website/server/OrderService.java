package com.golden.website.server;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.WebsiteOrder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrderService {
    ResultInfo addOrderInfo(HttpServletRequest request);

    ResultInfo deleteOrderByOrderNum(HttpServletRequest request);

    String getOrderByOrderNum(HttpServletRequest request);

    String updateOrderInfoByOrderNum(HttpServletRequest request);

    WebsiteOrder getProductOrderInfoByOrderNum4Alipay(String orderNum);

    int updateOrderPaymentStatusByOrderNum4Alipay(WebsiteOrder websiteOrder);

    List<WebsiteOrder> getOrderListByOrderNum(String out_trade_no);
}
