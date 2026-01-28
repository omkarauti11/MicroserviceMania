package com.myproject.OrderService.service;

import com.myproject.OrderService.model.OrderRequest;
import com.myproject.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
