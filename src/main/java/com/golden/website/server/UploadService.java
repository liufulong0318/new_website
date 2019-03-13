package com.golden.website.server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface  UploadService {
    String fileUp(HttpServletRequest request, String filePath)throws IOException,ServletException;
}
