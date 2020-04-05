package com.gmall.gmallorder.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    public String index(){
        return "index";
    }

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "ok";
    }

    @GetMapping("/getadd/{id}")
    @ResponseBody
    public List<UserAddress> getadd(String id){
        return userService.getUserAddressList(id);
    }
}
