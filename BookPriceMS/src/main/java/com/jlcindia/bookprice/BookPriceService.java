package com.jlcindia.bookprice;

import org.springframework.stereotype.Service;

@Service
public interface BookPriceService {

	public BooKPrice getBookPriceById(Integer bookId);
	public double getOfferedPriceById(Integer bookId);
}
