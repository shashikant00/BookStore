package com.jlcindia.placeorder.service;

import java.util.List;

import com.jlcindia.placeorder.dto.OrderInfo;
import com.jlcindia.placeorder.entity.Order;

public interface OrderService {

	public void placeOrder(OrderInfo orderInfo);
	public List<Order> getOrderByUserId(String userId);
}
