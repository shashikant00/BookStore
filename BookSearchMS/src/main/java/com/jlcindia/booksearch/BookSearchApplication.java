package com.jlcindia.booksearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookSearchApplication {

	static Logger log=LoggerFactory.getLogger(BookSearchApplication.class);
	public static void main(String[] args) {
		log.info("BookPriceMS - Begin");
		SpringApplication.run(BookSearchApplication.class, args);
		log.info("BookPriceMS - End");
	}
}
