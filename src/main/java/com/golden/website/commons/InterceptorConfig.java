package com.golden.website.commons;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2018/12/28.
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor()).addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/upload/**","/bootstrap/**","/images/**","/jquery/**","/myCSS/**","/myJS/**");//取消静态资源的拦截
        super.addInterceptors(registry);
    }
}
