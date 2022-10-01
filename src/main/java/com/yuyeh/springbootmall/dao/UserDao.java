package com.yuyeh.springbootmall.dao;

import com.yuyeh.springbootmall.dto.UserRegisterRequest;
import com.yuyeh.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
