package com.golden.website.server.imp;

import com.golden.website.commons.ResultInfo;
import com.golden.website.commons.Upload;
import com.golden.website.dao.*;
import com.golden.website.dataobject.*;
import com.golden.website.server.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
    @Autowired
    WebsiteDowhatMapper websiteDowhatMapper;
    @Autowired
    WebsiteHomeproductMapper websiteHomeproductMapper;
    @Autowired
    WebsiteIndustrycaseMapper websiteIndustrycaseMapper;
    @Autowired
    WebsiteCooperativeuserMapper websiteCooperativeuserMapper;
    //-----------START--------------轮播图的增加、删除、修改、查询------------------
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

    @Override
    public String editLunbotu(HttpServletRequest request) {
            ResultInfo resultInfo =  new ResultInfo();
            String name = request.getParameter("name").trim();
            //对名称
            if(name.length() <= 0){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，名称长度不能为空");
                return resultInfo.toString();
            }else if(name.length() > 30){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，名称长度不能大于30位");
                return resultInfo.toString();
            }else if(name.length() >= 0 && name.length() <= 30){
                String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(name);
                if(!m.matches()){
                    resultInfo.setCode("0");
                    resultInfo.setMsg("修改失败，名称含有非法字符");
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
                    resultInfo.setMsg("修改失败，链接不合法");
                    return resultInfo.toString();
                }
            }
            String order = request.getParameter("order");
            MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
            MultipartFile multipartFile = req.getFile("imgFile");

            String url = null;
            if(multipartFile != null){
                try {
                    url = Upload.upload(request);
                } catch (IOException e) {
                    System.out.println("未修改图片");
                }
            }
            WebsiteLunbotu websiteLunbotu = new WebsiteLunbotu();
            websiteLunbotu.setId(request.getParameter("id"));
            websiteLunbotu.setName(name);
            websiteLunbotu.setLink(link);
            websiteLunbotu.setUrl(url);
            websiteLunbotu.setOrder(Integer.parseInt(order));
            websiteLunbotu.setCreatetime(new Date());
            Integer count = 0;
            if(url != null){
                count = websiteLunbotuMapper.updateByPrimaryKey(websiteLunbotu);
            }else{
                count = websiteLunbotuMapper.updateByPrimaryKeyNotUrl(websiteLunbotu);
            }

            if(count > 0){
                resultInfo.setCode("1");
                resultInfo.setMsg("修改轮播图信息成功");
            }else{
                resultInfo.setCode("0");
                resultInfo.setMsg("修改轮播图信息失败，请稍后重试");
                resultInfo.toString();
            }
        return resultInfo.toString();
    }
    //-----------END--------------轮播图的增加、删除、修改、查询------------------
    //------------START--------------我们是做什么的增加、删除、修改、查询接口实现---------------------
    @Override
    public String addDowhat(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 6){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能大于6位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 6){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefUrl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，链接不合法");
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
        WebsiteDowhat websiteDowhat = new WebsiteDowhat();
        websiteDowhat.setId(UUID.randomUUID().toString());
        websiteDowhat.setIconUrl(url);
        websiteDowhat.setTitle(title);
        websiteDowhat.setHrefUrl(hrefUrl);
        websiteDowhat.setOrder(Integer.parseInt(order));
        websiteDowhat.setCreatetime(new Date());
        Integer count = websiteDowhatMapper.insert(websiteDowhat);
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("添加信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("添加信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public List<WebsiteDowhat> getAllOrderASC_Dowhat() {
        return websiteDowhatMapper.selectAll();
    }

    @Override
    public String deleteDowhatById(HttpServletRequest request) {
         int num = websiteDowhatMapper.deleteByPrimaryKey(request.getParameter("id"));
        ResultInfo resultInfo =  new ResultInfo();
        if(num >= 1 ){
            resultInfo.setCode("0");
            resultInfo.setMsg("删除信息成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("删除信息失败");
        }
        return resultInfo.toString();
    }

    @Override
    public String getDowhatById(HttpServletRequest request) {
        return websiteDowhatMapper.selectByPrimaryKey(request.getParameter("id")).toString();
    }

    @Override
    public String editDowhat(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 6){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能大于6位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 30){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefUrl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，链接不合法");
                return resultInfo.toString();
            }
        }
        String order = request.getParameter("order");
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = req.getFile("imgFile");

        String url = null;
        if(multipartFile != null){
            try {
                url = Upload.upload(request);
            } catch (IOException e) {
                System.out.println("未修改图片");
            }
        }
        WebsiteDowhat websiteDowhat = new WebsiteDowhat();
        websiteDowhat.setId(request.getParameter("id"));
        websiteDowhat.setIconUrl(url);
        websiteDowhat.setTitle(title);
        websiteDowhat.setHrefUrl(hrefUrl);
        websiteDowhat.setOrder(Integer.parseInt(order));
        websiteDowhat.setCreatetime(new Date());
        Integer count = 0;
        if(url != null){
            count = websiteDowhatMapper.updateByPrimaryKey(websiteDowhat);
        }else{
            count = websiteDowhatMapper.updateByPrimaryKeyNotUrl(websiteDowhat);
        }
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("修改信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("修改信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }
    //-------------END--------------我们是做什么增加、删除、修改、查询接口实现--------------------------
    //------------START--------------我们的产品增加、删除、修改、查询接口实现--------------------------
    @Override
    public String addHomeProduct(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能大于6位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefurl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，链接含有非法字符");
                return resultInfo.toString();
            }
        }
        String content = request.getParameter("content");
        if(content.length() <15){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，文本简介至少15个文字");
            return resultInfo.toString();
        }else if(content.length() > 4096){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，文本简介超过4096个文字");
            return resultInfo.toString();
        }else if(content != null){
            String pattern = "^^[|\\uff0c|\\u3001|\\u3002|\\uff08|\\uff09|\\u201c|\\u201d|\\s|\\u0026|\\u002e|a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(content);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，文本简介含有非法字符");
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
        WebsiteHomeproduct websiteHomeproduct = new WebsiteHomeproduct();
        websiteHomeproduct.setId(UUID.randomUUID().toString());
        websiteHomeproduct.setImgurl(url);
        websiteHomeproduct.setTitle(title);
        websiteHomeproduct.setHrefurl(hrefUrl);
        websiteHomeproduct.setContent(content);
        websiteHomeproduct.setOrder(Integer.parseInt(order));
        websiteHomeproduct.setCreatetime(new Date());
        Integer count = websiteHomeproductMapper.insert(websiteHomeproduct);
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("添加信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("添加信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public List<WebsiteHomeproduct> getAllOrderASC_HomeProduct() {
        return websiteHomeproductMapper.selectAll();
    }

    @Override
    public String deleteHomeProductById(HttpServletRequest request) {
        int num = websiteHomeproductMapper.deleteByPrimaryKey(request.getParameter("id"));
        ResultInfo resultInfo =  new ResultInfo();
        if(num >= 1 ){
            resultInfo.setCode("0");
            resultInfo.setMsg("删除信息成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("删除信息失败");
        }
        return resultInfo.toString();
    }

    @Override
    public String getHomeProductById(HttpServletRequest request) {
        return websiteHomeproductMapper.selectByPrimaryKey(request.getParameter("id")).toString();
    }

    @Override
    public String editHomeProduct(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能大于20位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String content = request.getParameter("content");
        if(content.length() <15){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，文本简介至少15个文字");
            return resultInfo.toString();
        }else if(content.length() > 4096){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，文本简介超过4096个文字");
            return resultInfo.toString();
        }else if(content != null){
            String pattern = "^^[|\\uff0c|\\u3001|\\u3002|\\uff08|\\uff09|\\u201c|\\u201d|\\s|\\u0026|\\u002e|a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(content);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，文本简介含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefUrl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，链接含有非法字符");
                return resultInfo.toString();
            }
        }
        String order = request.getParameter("order");
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = req.getFile("imgFile");

        String url = null;
        if(multipartFile != null){
            try {
                url = Upload.upload(request);
            } catch (IOException e) {
                System.out.println("未修改图片");
            }
        }
        WebsiteHomeproduct websiteHomeproduct = new WebsiteHomeproduct();
        websiteHomeproduct.setId(request.getParameter("id"));
        websiteHomeproduct.setImgurl(url);
        websiteHomeproduct.setTitle(title);
        websiteHomeproduct.setContent(content);
        websiteHomeproduct.setHrefurl(hrefUrl);
        websiteHomeproduct.setOrder(Integer.parseInt(order));
        websiteHomeproduct.setCreatetime(new Date());
        Integer count = 0;
        if(url != null){
            count = websiteHomeproductMapper.updateByPrimaryKey(websiteHomeproduct);
        }else{
            count = websiteHomeproductMapper.updateByPrimaryKeyNotUrl(websiteHomeproduct);
        }
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("修改信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("修改信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public WebsiteHomeproduct getHomeProductTop_1() {
        return websiteHomeproductMapper.getHomeProductTop_1();
    }

    @Override
    public WebsiteHomeproduct getHomeProductTop_2() {
        return websiteHomeproductMapper.getHomeProductTop_2();
    }
    //-------------END--------------我们的产品增加、删除、修改、查询接口实现--------------------------
    //------------START--------------行业案例增加、删除、修改、查询接口实现--------------------------
    @Override
    public String addIndustryCase(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能大于20位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefurl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，链接含有非法字符");
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
        WebsiteIndustrycase websiteIndustrycase = new WebsiteIndustrycase();
        websiteIndustrycase.setId(UUID.randomUUID().toString());
        websiteIndustrycase.setImgurl(url);
        websiteIndustrycase.setTitle(title);
        websiteIndustrycase.setHrefurl(hrefUrl);
        websiteIndustrycase.setOrder(Integer.parseInt(order));
        websiteIndustrycase.setCreatetime(new Date());
        Integer count = websiteIndustrycaseMapper.insert(websiteIndustrycase);
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("添加信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("添加信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public List<WebsiteIndustrycase> getAllOrderASC_IndustryCase() {
        return websiteIndustrycaseMapper.selectAll();
    }

    @Override
    public String deleteIndustryCaseById(HttpServletRequest request) {
        int num = websiteIndustrycaseMapper.deleteByPrimaryKey(request.getParameter("id"));
        ResultInfo resultInfo =  new ResultInfo();
        if(num >= 1 ){
            resultInfo.setCode("0");
            resultInfo.setMsg("删除信息成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("删除信息失败");
        }
        return resultInfo.toString();
    }

    @Override
    public String getIndustryCaseById(HttpServletRequest request) {
        return websiteIndustrycaseMapper.selectByPrimaryKey(request.getParameter("id")).toString();
    }

    @Override
    public String editIndustryCase(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能大于20位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String hrefUrl = request.getParameter("hrefUrl");
        if(hrefUrl != null){
            String pattern = "^(/)?+(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(hrefUrl);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，链接含有非法字符");
                return resultInfo.toString();
            }
        }
        String order = request.getParameter("order");
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = req.getFile("imgFile");

        String url = null;
        if(multipartFile != null){
            try {
                url = Upload.upload(request);
            } catch (IOException e) {
                System.out.println("未修改图片");
            }
        }
        WebsiteIndustrycase websiteIndustrycase = new WebsiteIndustrycase();
        websiteIndustrycase.setId(request.getParameter("id"));
        websiteIndustrycase.setImgurl(url);
        websiteIndustrycase.setTitle(title);
        websiteIndustrycase.setHrefurl(hrefUrl);
        websiteIndustrycase.setOrder(Integer.parseInt(order));
        websiteIndustrycase.setCreatetime(new Date());
        Integer count = 0;
        if(url != null){
            count = websiteIndustrycaseMapper.updateByPrimaryKey(websiteIndustrycase);
        }else{
            count = websiteIndustrycaseMapper.updateByPrimaryKeyNotUrl(websiteIndustrycase);
        }
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("修改信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("修改信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }
    //-------------END--------------行业案例增加、删除、修改、查询接口实现--------------------------

    //------------START--------------合作用户增加、删除、修改、查询接口实现--------------------------
    @Override
    public String addCooperativeUser(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("添加失败，标题长度不能大于20位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("添加失败，标题含有非法字符");
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
        WebsiteCooperativeuser websiteCooperativeuser = new WebsiteCooperativeuser();
        websiteCooperativeuser.setId(UUID.randomUUID().toString());
        websiteCooperativeuser.setImgurl(url);
        websiteCooperativeuser.setTitle(title);
        websiteCooperativeuser.setOrder(Integer.parseInt(order));
        websiteCooperativeuser.setCreatetime(new Date());
        Integer count = websiteCooperativeuserMapper.insert(websiteCooperativeuser);
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("添加信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("添加信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }

    @Override
    public List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser() {
        return websiteCooperativeuserMapper.selectAll();
    }
    @Override
    public List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_1_12() {
        return websiteCooperativeuserMapper.selectAll_1_12();
    }
    @Override
    public List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_13_24() {
        return websiteCooperativeuserMapper.selectAll_13_24();
    }
    @Override
    public List<WebsiteCooperativeuser> getAllOrderASC_CooperativeUser_25_36() {
        return websiteCooperativeuserMapper.selectAll_25_36();
    }
    @Override
    public String deleteCooperativeUserById(HttpServletRequest request) {
        int num = websiteCooperativeuserMapper.deleteByPrimaryKey(request.getParameter("id"));
        ResultInfo resultInfo =  new ResultInfo();
        if(num >= 1 ){
            resultInfo.setCode("0");
            resultInfo.setMsg("删除信息成功");
        }else{
            resultInfo.setCode("1");
            resultInfo.setMsg("删除信息失败");
        }
        return resultInfo.toString();
    }

    @Override
    public String getCooperativeUserById(HttpServletRequest request) {
        return websiteCooperativeuserMapper.selectByPrimaryKey(request.getParameter("id")).toString();
    }

    @Override
    public String editCooperativeUser(HttpServletRequest request) {
        ResultInfo resultInfo =  new ResultInfo();
        String title = request.getParameter("title").trim();
        //对名称
        if(title.length() <= 0){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能为空");
            return resultInfo.toString();
        }else if(title.length() > 20){
            resultInfo.setCode("0");
            resultInfo.setMsg("修改失败，标题长度不能大于20位");
            return resultInfo.toString();
        }else if(title.length() >= 0 && title.length() <= 20){
            String pattern = "^^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(title);
            if(!m.matches()){
                resultInfo.setCode("0");
                resultInfo.setMsg("修改失败，标题含有非法字符");
                return resultInfo.toString();
            }
        }
        String order = request.getParameter("order");
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = req.getFile("imgFile");

        String url = null;
        if(multipartFile != null){
            try {
                url = Upload.upload(request);
            } catch (IOException e) {
                System.out.println("未修改图片");
            }
        }
        WebsiteCooperativeuser websiteCooperativeuser = new WebsiteCooperativeuser();
        websiteCooperativeuser.setId(request.getParameter("id"));
        websiteCooperativeuser.setImgurl(url);
        websiteCooperativeuser.setTitle(title);
        websiteCooperativeuser.setOrder(Integer.parseInt(order));
        websiteCooperativeuser.setCreatetime(new Date());
        Integer count = 0;
        if(url != null){
            count = websiteCooperativeuserMapper.updateByPrimaryKey(websiteCooperativeuser);
        }else{
            count = websiteCooperativeuserMapper.updateByPrimaryKeyNotUrl(websiteCooperativeuser);
        }
        if(count > 0){
            resultInfo.setCode("1");
            resultInfo.setMsg("修改信息成功");
        }else{
            resultInfo.setCode("0");
            resultInfo.setMsg("修改信息失败，请稍后重试");
        }
        return resultInfo.toString();
    }
    //-------------END--------------合作用户增加、删除、修改、查询接口实现--------------------------
}
