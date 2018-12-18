package com.golden.website.controller;

import com.golden.website.commons.ResultInfo;
import com.golden.website.commons.Upload;
import com.golden.website.dao.WebsiteLunbotuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
@RequestMapping("/")
public class ManageController {
    @Autowired
    WebsiteLunbotuMapper websiteLunbotuMapper;

    @RequestMapping("/addLunbotu")
    public String addLunbotu(HttpServletRequest request) throws IOException {
        ResultInfo resultInfo = new ResultInfo();
        String name = request.getParameter("name");
        String link = request.getParameter("link");
        String url = Upload.upload(request);
//        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
//        MultipartFile multipartFile = req.getFile("imgFile");
//        byte[] bs = multipartFile.getBytes();
//        int stateInt = 1;
//        if (bs.length > 0) {
//            try {
//                String filePath = System.getProperty("user.dir");
//                filePath = filePath.substring(0,filePath.lastIndexOf("\\")).replace("\\","/")+"/upload";
//                System.out.println("开始上传");
//                File validateCodeFolder = new File(filePath);
//                if (!validateCodeFolder.exists()) {
//                    validateCodeFolder.mkdirs();
//                }
//                // 将字符串转换成二进制，用于显示图片
//                // 将上面生成的图片格式字符串 imgStr，还原成图片显示
//                String type = ".jpg";
//                String uuid = UUID.randomUUID().toString();
//                String filename = uuid + type;
//                InputStream in = new ByteArrayInputStream(bs);
//                File file = new File(filePath, filename);// 可以是任何图片格式.jpg,.png等
//                FileOutputStream fos = new FileOutputStream(file);
//                byte[] b = new byte[1024];
//                int nRead = 0;
//                while ((nRead = in.read(b)) != -1) {
//                    fos.write(b, 0, nRead);
//                }
//                fos.flush();
//                fos.close();
//                in.close();
//                resultInfo.setCode("1");
//                resultInfo.setMsg("添加轮播图成功");
//            } catch (Exception e) {
//                stateInt = 0;
//                e.printStackTrace();
//            } finally {
//            }
//        } else {
//            resultInfo.setCode("0");
//            resultInfo.setMsg("添加轮播图失败");
//        }
        return resultInfo.toString();
    }

}
