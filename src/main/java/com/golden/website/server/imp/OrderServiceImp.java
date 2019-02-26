package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dao.WebsiteOrderMapper;
import com.golden.website.dataobject.WebsiteOrder;
import com.golden.website.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    WebsiteOrderMapper websiteOrderMapper;

    @Override
    public ResultInfo addOrderInfo(HttpServletRequest request) {
        ResultInfo resultInfo = new ResultInfo();
        WebsiteOrder wo =  new WebsiteOrder();
        wo.setId(request.getParameter("userId"));
        wo.setProductName(request.getParameter("product_name"));
        wo.setProductTag(Integer.parseInt(request.getParameter("product_tag")));
        wo.setProductTotal(Integer.parseInt(request.getParameter("product_total")));
        wo.setProductPurchaser(request.getParameter("product_purchaser"));
        wo.setProductPhone(request.getParameter("product_phone"));
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
}
