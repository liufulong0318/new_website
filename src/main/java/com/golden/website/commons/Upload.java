package com.golden.website.commons;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * Created by Administrator on 2018/12/19.
 */
public class Upload {
    public static String upload(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = req.getFile("imgFile");

        byte[] bs = multipartFile.getBytes();
        String filePath = System.getProperty("user.dir");
        String filename=null;
        int stateInt = 1;
        if (bs.length > 0) {
            try {
                filePath = filePath.substring(0,filePath.lastIndexOf("\\")).replace("\\","/")+"/upload";
                File validateCodeFolder = new File(filePath);
                if (!validateCodeFolder.exists()) {
                    validateCodeFolder.mkdirs();
                }
                // 将字符串转换成二进制，用于显示图片
                // 将上面生成的图片格式字符串 imgStr，还原成图片显示
                String src_filename = multipartFile.getOriginalFilename();
                String type = src_filename.substring(src_filename.lastIndexOf("."),src_filename.length());
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
        /*return filePath+"/"+filename;*/
        return "/upload/"+filename;
    }
}
