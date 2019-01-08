package com.golden.website.commons;

import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/12/28.
 */
public class Interceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String ip = request.getRemoteHost ();//ip
//        String path = request.getRequestURI();//请求路径
//        String method = request.getMethod();//请求方法

        HandlerMethod h = (HandlerMethod) handler;
        //Controller 的包名
        String controller = h.getBean().getClass().getName();
        System.out.println("controller: " + controller);
        //方法名称
        String method = h.getMethod().getName();
        System.out.println("method: " + method);
        //请求方式  post\put\get 等等
        String requestMethod = request.getMethod();
        System.out.println("requestMethod: " + requestMethod);
        //所有的请求参数
//        String params = parmeter
        //部分请求链接
        String URI = request.getRequestURI();
        System.out.println("URI: " + URI);
        //完整的请求链接
        String AllURI = request.getRequestURL().toString();
        System.out.println("AllURI: " + AllURI);
        //请求方的 ip地址
        String IP = request.getRemoteHost();
        System.out.println("IP: " + IP);
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
