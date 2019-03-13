package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteOrderMapper;
import com.golden.website.dataobject.WebsiteOrder;
import com.golden.website.server.OrderService;
import com.golden.website.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    WebsiteOrderMapper websiteOrderMapper;
    @Autowired
    UserServiceImp userServiceImp;
    @Override
    public ResultInfo addOrderInfo(HttpServletRequest request) {
        ResultInfo resultInfo = userServiceImp.checkIsLogin(request);//校验登录
        if(resultInfo != null){
            return resultInfo;
        }else{
            resultInfo = new ResultInfo();
        }
        WebsiteOrder wo =  new WebsiteOrder();
        wo.setId(request.getParameter("userId"));
        wo.setOrderNum(UUID.randomUUID().toString());
        wo.setProductName(request.getParameter("product_name"));
        wo.setProductTag(Integer.parseInt(request.getParameter("product_tag")));
        wo.setProductTotal(Integer.parseInt(request.getParameter("product_total")));
        wo.setProductPurchaser(request.getParameter("product_purchaser"));
        wo.setProductPhone(request.getParameter("product_phone"));
        wo.setReceivingName(request.getParameter("receiving_name"));
        wo.setReceivingMethod(request.getParameter("receiving_method"));
        wo.setReceivingAddress(request.getParameter("receiving_address"));
        wo.setReceivingPhone(request.getParameter("receiving_phone"));
        wo.setOrderTime(new Date());
        String code = request.getParameter("code");
        //验证码校验
        Jedis jedis = new Jedis("localhost");
        Boolean exists = jedis.exists(code.toLowerCase());
        if (exists) {
            if (!((code.toLowerCase().hashCode() + "").equals(jedis.get(code.toLowerCase())))) {
                resultInfo.setCode("0");
                resultInfo.setMsg("提交订单失败，验证码错误");
                return resultInfo;
            }
        } else {
            resultInfo.setCode("0");
            resultInfo.setMsg("提交订单失败，验证码错误");
            return resultInfo;
        }
        int count = websiteOrderMapper.insert(wo);

        if(count > 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("订单添加成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("订单添加失败，请稍后重试");
        }
        return resultInfo;
    }

    @Override
    public ResultInfo deleteOrderByOrderNum(HttpServletRequest request) {
        ResultInfo resultInfo = userServiceImp.checkIsLogin(request);//校验登录
        if(resultInfo != null){
            return resultInfo;
        }else{
            resultInfo = new ResultInfo();
        }
        int count = websiteOrderMapper.deleteOrderByOrderNum(request.getParameter("orderNum"));
        if(count > 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("订单删除成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("订单删除失败，请稍后重试");
        }
        return resultInfo;
    }

    @Override
    public String getOrderByOrderNum(HttpServletRequest request) {
        ResultInfo resultInfo = userServiceImp.checkIsLogin(request);//校验登录
        if(resultInfo != null){
            return resultInfo.toString();
        }else{
            resultInfo = new ResultInfo();
        }
        WebsiteOrder wo = websiteOrderMapper.getOrderByOrderNum(request.getParameter("orderNum"));
        return wo.toString();
    }
    @Override
    public String updateOrderInfoByOrderNum(HttpServletRequest request) {
        ResultInfo resultInfo = userServiceImp.checkIsLogin(request);//校验登录
        if(resultInfo != null){
            return resultInfo.toString();
        }else{
            resultInfo = new ResultInfo();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        WebsiteOrder wo = new WebsiteOrder();
        wo.setOrderNum(request.getParameter("orderNum"));
        wo.setOptionName(request.getSession().getAttribute("loginusername").toString());
        wo.setOptiionTime(new Date());
        wo.setSender(request.getParameter("sender"));
        wo.setExpressCompanyName(request.getParameter("expressCompanyName"));
        wo.setExpressNum(request.getParameter("expressNum"));
        try {
            wo.setExpressOutTime(sdf.parse(request.getParameter("expressOutTime")));
        } catch (ParseException e) {
            resultInfo.setCode("0");
            resultInfo.setMsg("日期格式错误");
        }
        wo.setReceivingStatus("1");//已发货
        wo.setRemarks(request.getParameter("remarks"));
        int count = websiteOrderMapper.updateOrderByOrderNum(wo);
        if(count > 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("订单修改成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("订单修改失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public WebsiteOrder getProductOrderInfoByOrderNum4Alipay(String orderNum) {
        return websiteOrderMapper.getProductOrderInfoByOrderNum4Alipay(orderNum);
    }

    @Override
    public int updateOrderPaymentStatusByOrderNum4Alipay(WebsiteOrder websiteOrder) {
        return websiteOrderMapper.updateOrderPaymentStatusByOrderNum4Alipay(websiteOrder);
    }

    @Override
    public List<WebsiteOrder> getOrderListByOrderNum(String orderNum) {
        return websiteOrderMapper.getOrderListByOrderNum(orderNum);
    }
}
