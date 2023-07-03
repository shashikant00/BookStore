package com.jlcindia.placeorder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlcindia.placeorder.entity.OrderItem;

@Repository
public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{

	List<OrderItem> findOrderItemsByOrderId(Integer orderId);
}
