package com.yuyeh.springbootmall.service;

import com.yuyeh.springbootmall.dto.CreateOrderRequest;
import com.yuyeh.springbootmall.dto.OrderQueryParams;
import com.yuyeh.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
