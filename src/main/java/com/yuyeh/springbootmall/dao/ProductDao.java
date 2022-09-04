package com.yuyeh.springbootmall.dao;

import com.yuyeh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}