package com.jlcindia.booksearch.service;

import java.util.List;

import com.jlcindia.booksearch.Book;
import com.jlcindia.booksearch.BookInventory;
import com.jlcindia.booksearch.BookRating;
import com.jlcindia.booksearch.dto.BookInfo;

public interface BookService {

	public  List<Book> getBooks(String author,String category);
	public BookInfo getBookInfo(Integer bookId);
	public void updateBookRating(BookRating bookRating);
	public void updateBookInventory(BookInventory bookInventory);
}
