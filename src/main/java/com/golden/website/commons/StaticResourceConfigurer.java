package com.golden.website.commons;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/12/19.
 */
@Configuration
public class StaticResourceConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String filePath = System.getProperty("user.dir");
        filePath = filePath.substring(0, filePath.lastIndexOf("\\")).replace("\\", "/") + "/upload/";
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + filePath);
    }
}
