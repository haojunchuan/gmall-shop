package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<UserInfo> fiandAll();

    /*
    根据用户ID查询用户地址
     */
    List<UserAddress> getUserAddressList(String id);
}
