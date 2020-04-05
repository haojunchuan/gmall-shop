package com.atguigu.gmall0218.usermanager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.bean.UserInfo;
import com.atguigu.gmall0218.service.UserService;
import com.atguigu.gmall0218.usermanager.mapper.UserAddressMapper;
import com.atguigu.gmall0218.usermanager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpll implements UserService {
    @Resource
    UserInfoMapper userInfoMapper;

    @Resource
    UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> fiandAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String id) {
        UserAddress ua = new UserAddress();
        ua.setId(id);
        return userAddressMapper.select(ua);
    }
}
