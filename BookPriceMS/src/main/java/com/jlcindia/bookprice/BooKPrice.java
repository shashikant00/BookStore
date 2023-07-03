package com.jlcindia.bookprice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "mybookprice",schema = "jlcbookpricedb")
public class BooKPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bookId_generator")
	@SequenceGenerator(name = "bookId_generator",sequenceName = "mybookId_gen",
	initialValue = 110,allocationSize = 1)
	@Column(name = "book_Id")
	private Integer bookId;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "offer")
	private double offer;
	
	public BooKPrice() {}

	public BooKPrice( double price, double offer) {
		super();
		this.price = price;
		this.offer = offer;
	}
	public BooKPrice(Integer bookId, double price, double offer) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "[" + bookId + "," + price + ", " + offer + "]";
	}
	
}
