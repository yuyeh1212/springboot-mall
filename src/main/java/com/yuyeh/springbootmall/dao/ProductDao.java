package com.yuyeh.springbootmall.dao;

import com.yuyeh.springbootmall.dto.ProductQueryParams;
import com.yuyeh.springbootmall.dto.ProductRequest;
import com.yuyeh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}