package com.atguigu.gmall0218.usermanager.service.impl;

import com.atguigu.gmall0218.bean.UserInfo;
import com.atguigu.gmall0218.service.UserService;
import com.atguigu.gmall0218.usermanager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpll implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> fiandAll() {
        return userInfoMapper.selectAll();
    }
}
