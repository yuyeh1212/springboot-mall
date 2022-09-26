package com.yuyeh.springbootmall.dao;

import com.yuyeh.springbootmall.constant.ProductCategory;
import com.yuyeh.springbootmall.dto.ProductRequest;
import com.yuyeh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}