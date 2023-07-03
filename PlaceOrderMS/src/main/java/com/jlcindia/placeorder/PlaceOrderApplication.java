package com.jlcindia.placeorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.jlcindia.placeorder")
public class PlaceOrderApplication {

	static Logger log=LoggerFactory.getLogger(PlaceOrderApplication.class);
	
	public static void main(String[] args) {
		log.info("PlaceOrderMS - Begin");
		SpringApplication.run(PlaceOrderApplication.class, args);
		log.info("PlaceOrderMS - End");
	}
}
