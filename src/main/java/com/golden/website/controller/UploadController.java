package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.dataobject.WebsiteUploadDetail;
import com.golden.website.enums.UserPrivilege;
import com.golden.website.server.ManageService;
import com.golden.website.server.UploadService;
import com.golden.website.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Api(value = "UploadController", description = "公共上传接口")
@RestController
@RequestMapping("/")
@MultipartConfig
public class UploadController {
    @Autowired
    UserService userService;
    @Autowired
    UploadService uploadService;


    @ApiOperation(value = "文件上传", notes = "文件上传")
    @ApiImplicitParam(paramType = "query", name = "imgFile", value = "上传文件", required = true, dataType = "MultipartFile")
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request) throws IOException {
        ResultInfo resultInfo = userService.checkIsLogin(request);
        if (resultInfo == null) {
            if (userService.getRoleByLoginusername(request).getRole().equals("1")) {//管理员登录具有权限操作
                MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
                MultipartFile multipartFile = req.getFile("imgFile");

                byte[] bs = multipartFile.getBytes();
                String filePath = System.getProperty("user.dir");
                String filename = null;
                int stateInt = 1;
                if (bs.length > 0) {
                    try {
                        filePath = filePath.substring(0, filePath.lastIndexOf("\\")).replace("\\", "/") + "/upload";
                        File validateCodeFolder = new File(filePath);
                        if (!validateCodeFolder.exists()) {
                            validateCodeFolder.mkdirs();
                        }
                        // 将字符串转换成二进制，用于显示图片
                        // 将上面生成的图片格式字符串 imgStr，还原成图片显示
                        String src_filename = multipartFile.getOriginalFilename();
                        String type = src_filename.substring(src_filename.lastIndexOf("."), src_filename.length());
                        String uuid = UUID.randomUUID().toString();
                        filename = uuid + type;
                        InputStream in = new ByteArrayInputStream(bs);
                        File file = new File(filePath, filename);// 可以是任何图片格式.jpg,.png等
                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] b = new byte[1024];
                        int nRead = 0;
                        while ((nRead = in.read(b)) != -1) {
                            fos.write(b, 0, nRead);
                        }
                        fos.flush();
                        fos.close();
                        in.close();

                    } catch (Exception e) {
                        stateInt = 0;
                        e.printStackTrace();
                    } finally {
                    }
                } else {

                }
                StringBuffer info = new StringBuffer();
                info.append("{");
                info.append("\"errno\":\"0\",");
                info.append("\"data\":[\"/upload/" + filename + "\"]");
                info.append("}");
                return info.toString();
            } else {
                resultInfo = new ResultInfo();
                resultInfo.setCode("0");
                resultInfo.setMsg("对不起，您没有权限");
                return resultInfo.toString();
            }
        } else {
            return resultInfo.toString();
        }

    }

    //@MultipartConfig(maxFileSize = -1,location = "default",maxRequestSize = -1);
    @RequestMapping(value = "fileUp", method = RequestMethod.POST)
    public String fileUp(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ResultInfo resultInfo = userService.checkIsLogin(request);//验证是否登录
        //这里做一下判断,如果ResultInfo 对象不为空说明未登录.
        if (resultInfo != null) {
            return resultInfo.toString();
        }
        resultInfo = new ResultInfo();
        String role = userService.getRoleByLoginusername(request).getRole();
        //有权限
        if (null != role) {
            int privilege = Integer.parseInt(role);
            //对此操作的权限进行过滤,只有超级用户才能上传文件.
            if (privilege == UserPrivilege.superUser.getPrivilege()) {
                String filePath = System.getProperty("user.dir");
                filePath = filePath.substring(0, filePath.lastIndexOf("\\")).replace("\\", "/");
                uploadService.fileUp(request, filePath);
                resultInfo.setCode("200");
                resultInfo.setMsg("上传成功!");
            }
            //没有权限
        } else {

            resultInfo.setCode("0");
            resultInfo.setMsg("对不起，您没有权限");

        }
        return resultInfo.toString();
    }


}


