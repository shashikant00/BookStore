package com.jlcindia.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //CORS
@RestController
public class BookPriceController {

	@Autowired
	BookPriceService bookPriceService;
	
	static Logger log=LoggerFactory.getLogger(BookPriceController.class);
	
	@GetMapping("/bookPrice/{bookId}")
	public  BooKPrice getBookPrice(@PathVariable Integer bookId)
	{
		log.info("----BookPriceController - getBookPrice()----");
		
		BooKPrice bookPrice=bookPriceService.getBookPriceById(bookId);
		return bookPrice;
	}
	
	@GetMapping("/offeredPrice/{bookId}")
	public double getOfferedPrice(@PathVariable Integer bookId) {
		log.info("----BookPriceController - getOfferedPrice()----");
		
		double offeredPrice=bookPriceService.getOfferedPriceById(bookId);
		
		return offeredPrice;
	}
}
