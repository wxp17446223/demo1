package com.example.service.impl;

import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.example.bean.User;
import com.example.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

}
