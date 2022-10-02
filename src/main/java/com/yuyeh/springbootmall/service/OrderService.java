package com.yuyeh.springbootmall.service;

import com.yuyeh.springbootmall.dto.CreateOrderRequest;
import com.yuyeh.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
