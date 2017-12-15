package com.bharath.springboot.topic;

public class Topic {
	private int bookNumber;
	private String bookName;
	private String bookDescription;
	
	public Topic() {
		
	}
	public Topic(int bookNumber, String bookName, String bookDescription) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	

}
