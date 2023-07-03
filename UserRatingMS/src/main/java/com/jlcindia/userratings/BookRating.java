package com.jlcindia.userratings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mybookratings",schema = "jlcratingsdb")
public class BookRating {

	@Id
	@Column(name = "book_id")
	private Integer bookId;
	
	@Column(name = "avg_rating")
	private double avgRating;
	
	@Column(name = "number_of_searches")
	private int numberOfSearches;

	public BookRating() {}
	public BookRating( double avgRating, int numberOfSearches) {
		super();
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}
	
	public BookRating(Integer bookId, double avgRating, int numberOfSearches) {
		super();
		this.bookId = bookId;
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	public int getNumberOfSearches() {
		return numberOfSearches;
	}
	public void setNumberOfSearches(int numberOfSearches) {
		this.numberOfSearches = numberOfSearches;
	}
	@Override
	public String toString() {
		return " [" + bookId + "," + avgRating + "," + numberOfSearches
				+ "]";
	}
	
	
}
