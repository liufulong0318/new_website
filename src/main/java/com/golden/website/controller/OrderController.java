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

    @ApiOperation(value="根据订单编号删除订单信息", notes="根据订单编号删除订单信息")
    @RequestMapping(value = "deleteOrderByOrderNum",method = RequestMethod.POST)
    public String deleteOrderByOrderNum(HttpServletRequest request) {
        ResultInfo resultInfo = orderService.deleteOrderByOrderNum(request);
        return resultInfo.toString();
    }

    @ApiOperation(value="根据订单编号获取订单信息", notes="根据订单编号获取订单信息")
    @RequestMapping(value = "getOrderByOrderNum",method = RequestMethod.POST)
    public String getOrderByOrderNum(HttpServletRequest request) {
        return orderService.getOrderByOrderNum(request);
    }

    @ApiOperation(value="根据订单编号修改订单信息", notes="根据订单编号修改订单信息")
    @RequestMapping(value = "updateOrderInfoByOrderNum",method = RequestMethod.POST)
    public String updateOrderInfoByOrderNum(HttpServletRequest request) {
        return orderService.updateOrderInfoByOrderNum(request);
    }
}
