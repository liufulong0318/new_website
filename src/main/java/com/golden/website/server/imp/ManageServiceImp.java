package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.commons.Upload;
import com.golden.website.dao.WebsiteLunbotuMapper;
import com.golden.website.dataobject.WebsiteLunbotu;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ManageServiceImp implements ManageService{

    @Autowired
    WebsiteLunbotuMapper websiteLunbotuMapper;
    @Override
    public String addLunbotu(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String name = request.getParameter("name").trim();
        //对名称
        if(name.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，名称长度不能为空");
            return resultInfo.toString();
        }else if(name.length() > 30){
            resultInfo.setCode("0");
            resultInfo.setMsg("注册失败，名称长度不能大于30位");
            return resultInfo.toString();
        }else if(name.length() >= 0 && name.length() <= 30){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(name);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，名称含有非法字符");
                return resultInfo.toString();
            }
        }
        String link = request.getParameter("link");
        if(link != null){
            String pattern = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(link);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("注册失败，链接不合法");
                return resultInfo.toString();
            }
        }
        String order = request.getParameter("order");
        String url = null;
        try {
            url = Upload.upload(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebsiteLunbotu websiteLunbotu = new WebsiteLunbotu();
        websiteLunbotu.setId(UUID.randomUUID().toString());
        websiteLunbotu.setName(name);
        websiteLunbotu.setLink(link);
        websiteLunbotu.setUrl(url);
        websiteLunbotu.setOrder(Integer.parseInt(order));
        websiteLunbotu.setCreatetime(new Date());
        Integer count = websiteLunbotuMapper.insert(websiteLunbotu);
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("添加轮播图信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("添加轮播图信息失败，请稍后重试");
            resultInfo.toString();
        }
        return resultInfo.toString();
    }

    @Override
    public List<WebsiteLunbotu> getAllOrderASC() {
        return websiteLunbotuMapper.selectAll();
    }

    @Override
    public String deleteLunbotuById(HttpServletRequest request) {
       int num = websiteLunbotuMapper.deleteByPrimaryKey(request.getParameter("id"));
        ResultInfo resultInfo =  new ResultInfo();
       if(num >= 1 ){
           resultInfo.setCode("0");
           resultInfo.setMsg("删除轮播图信息成功");
       }else{
           resultInfo.setCode("1");
           resultInfo.setMsg("删除轮播图信息失败");
       }
        return resultInfo.toString();
    }

    @Override
    public String getLunbotuById(HttpServletRequest request) {
        WebsiteLunbotu websiteLunbotu = websiteLunbotuMapper.selectByPrimaryKey(request.getParameter("id"));
        return websiteLunbotu.toString();
    }
}
