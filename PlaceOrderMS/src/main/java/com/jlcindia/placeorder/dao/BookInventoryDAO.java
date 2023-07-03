package com.jlcindia.placeorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlcindia.placeorder.entity.BookInventory;

@Repository
public interface BookInventoryDAO extends JpaRepository<BookInventory,Integer>{

}
