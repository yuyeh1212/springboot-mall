package com.yuyeh.springbootmall.service;

import com.yuyeh.springbootmall.dto.ProductRequest;
import com.yuyeh.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
