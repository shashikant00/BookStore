package com.jlcindia.placeorder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jlcindia.placeorder.entity.Order;

@Repository
public interface OrderDAO extends JpaRepository<Order,Integer>{

	List<Order> findOrdersByUserId(String userId);
}
