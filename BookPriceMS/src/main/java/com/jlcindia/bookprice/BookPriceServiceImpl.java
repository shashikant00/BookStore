package com.jlcindia.bookprice;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BookPriceServiceImpl implements BookPriceService{

	static Logger log=LoggerFactory.getLogger(BookPriceServiceImpl.class);
	
	@Autowired
	BookPriceDAO bookPriceDAO;
	
	@Override
	public BooKPrice getBookPriceById(Integer bookId) {
	log.info("-------BookPriceServiceImpl - getBookPriceById()---------");
	
	BooKPrice bookPrice=null;
	Optional<BooKPrice> opt=bookPriceDAO.findById(bookId);
	if(opt.isPresent()) {
		bookPrice=opt.get();
	}
		return bookPrice;
	}

	@Override
	public double getOfferedPriceById(Integer bookId) {
		log.info("-------BookPriceServiceImpl - getOfferedPriceById()---------");
		
		double offerPrice=0.0;
		Optional<BooKPrice> opt=bookPriceDAO.findById(bookId);
		if(opt.isPresent()) {
			BooKPrice bookPrice=opt.get();
			double price=bookPrice.getPrice();
			double offer=bookPrice.getOffer();
			
			if(offer<=0) {
				return price;
			}
			offerPrice=price-price*offer/100;
		}
		return offerPrice;
	}

}
