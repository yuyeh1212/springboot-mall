package com.yuyeh.springbootmall.service;

import com.yuyeh.springbootmall.dto.UserLoginRequest;
import com.yuyeh.springbootmall.dto.UserRegisterRequest;
import com.yuyeh.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
