package com.atguigu.gmall0218.usermanager.controller;

import com.atguigu.gmall0218.bean.UserInfo;
import com.atguigu.gmall0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    UserService userService;

    @GetMapping("users")
    public List<UserInfo> users(){
        return userService.fiandAll();
    }
}
