package com.golden.website.server.imp;

import com.golden.website.server.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Override
    public void getUser() {
        System.out.println("测试");
    }
}
