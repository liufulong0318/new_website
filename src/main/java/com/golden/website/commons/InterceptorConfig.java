package com.golden.website.commons;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/12/28.
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor()).addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/upload/**")//取消静态资源的拦截
                .excludePathPatterns("/bootstrap/**")//取消静态资源的拦截
                .excludePathPatterns("/images/**")//取消静态资源的拦截
                .excludePathPatterns("/jquery/**")//取消静态资源的拦截
                .excludePathPatterns("/myCSS/**")//取消静态资源的拦截
                .excludePathPatterns("/myJS/**");//取消静态资源的拦截
    }
}
