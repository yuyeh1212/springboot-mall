package com.yuyeh.springbootmall.dao;

import com.yuyeh.springbootmall.dto.ProductRequest;
import com.yuyeh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}