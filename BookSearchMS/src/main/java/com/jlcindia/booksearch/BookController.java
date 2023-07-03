package com.jlcindia.booksearch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlcindia.booksearch.dto.BookInfo;
import com.jlcindia.booksearch.service.BookService;


@RestController
@CrossOrigin
public class BookController {

	static Logger log=LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/mybooks/{author}/{category}")
	public List<Book> getBooks(@PathVariable String author,@PathVariable String category){
		log.info("----BookController ----getBooks()----");
		System.out.println(author + "\t" + category);
		
		return bookService.getBooks(author, category);
	}
	
	@GetMapping("/mybook/{bookId}")
	public BookInfo getBookById(@PathVariable Integer bookId) {
		log.info("----BookController ----getBookById()----");
		return bookService.getBookInfo(bookId);
	}
	
	@PutMapping("/updateBookRating")
	public void updateBookRating(@RequestBody BookRating bookRating) {
		System.out.println("----BookController ----updateBookRating()----");
		bookService.updateBookRating(bookRating);
	}
	
	@PutMapping("/updateBookInventory")
	public void updateBookInventory(@RequestBody BookInventory bookInventory) {
		System.out.println("----BookController ----updateBookInventory()----");
		
		bookService.updateBookInventory(bookInventory);
	}
}
