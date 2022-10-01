package com.yuyeh.springbootmall.service.impl;

import com.yuyeh.springbootmall.dao.UserDao;
import com.yuyeh.springbootmall.dto.UserRegisterRequest;
import com.yuyeh.springbootmall.model.User;
import com.yuyeh.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
