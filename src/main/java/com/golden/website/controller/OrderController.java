package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.server.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(value = "OrderController", description = "订单管理")
@RestController
@RequestMapping("/")
public class OrderController {
    @Autowired
    OrderService orderService;
    @ApiOperation(value="新增订单信息", notes="新增订单信息")
    @RequestMapping(value = "addOrderInfo",method = RequestMethod.POST)
    public String addOrderInfo(HttpServletRequest request) {
        ResultInfo resultInfo = orderService.addOrderInfo(request);
        return resultInfo.toString();
    }
}
