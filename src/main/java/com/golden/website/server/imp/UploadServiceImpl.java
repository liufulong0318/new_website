package com.golden.website.server.imp;

import com.golden.website.dao.WebsiteUploadDetailMapper;
import com.golden.website.dataobject.WebsiteUploadDetail;
import com.golden.website.server.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;


@SuppressWarnings("ALL")
@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
     WebsiteUploadDetailMapper websiteUploadDetailMapper;

    public String fileUp(HttpServletRequest request,String filePath)throws IOException, ServletException {
        Collection<Part> parts = request.getParts();
        String username = (String) request.getSession().getAttribute("loginusername");
        for (Part file : parts) {
            //绝对路径
            String savePath = filePath;
            //相对路径
            String relativePath="";
            String fileName = file.getName();
            long size = file.getSize();
               size =size/1024;

            if (fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("gif")) {
                relativePath="/upload";
                savePath += relativePath;
            } else if (fileName.endsWith("mp4") || fileName.endsWith("avi") || fileName.endsWith("mp3")) {
                relativePath="/upload/video";
                savePath += relativePath;
            } else {
                relativePath="/upload/temp";
                savePath +=relativePath;
            }
            File saveFolder = new File(savePath);
            if (!saveFolder.exists()) {
                saveFolder.mkdirs();
            }
            String type = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
            String uuid = UUID.randomUUID().toString();
            String fileNameAlias =uuid +"."+ type;//文件别名
            file.write(savePath + "/"+ fileNameAlias);
            WebsiteUploadDetail websiteUploadDetail = new WebsiteUploadDetail();
            websiteUploadDetail.setFilename(fileName);
            websiteUploadDetail.setFileupdate(new Date());
            websiteUploadDetail.setFilepath(relativePath+"/"+fileNameAlias);
            websiteUploadDetail.setFileuploader(username);
            websiteUploadDetail.setIsdelete("0");//这里的删除为逻辑删除,0为未删除状态,1为删除状态.
            websiteUploadDetail.setFiledesc(size+"kb");
            websiteUploadDetail.setFiletype(type);
            websiteUploadDetailMapper.insert(websiteUploadDetail);
        }
        return "";
    }
}
