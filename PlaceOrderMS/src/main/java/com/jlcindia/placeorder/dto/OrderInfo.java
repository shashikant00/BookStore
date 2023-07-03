package com.jlcindia.placeorder.dto;

import java.util.List;

import com.jlcindia.placeorder.entity.Order;
import com.jlcindia.placeorder.entity.OrderItem;

public class OrderInfo {

	private Order order;
	private List<OrderItem> itemsList;
	
	public OrderInfo() {}
	public OrderInfo(Order order, List<OrderItem> itemsList) {
		super();
		this.order = order;
		this.itemsList = itemsList;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderItem> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<OrderItem> itemsList) {
		this.itemsList = itemsList;
	}
		
}
