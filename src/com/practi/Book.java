package com.practi;

import java.util.List;

public class Book {

	int id;
	String bookName;
	List<String> authors;

	public Book(int id, String bookName, List<String> authors) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authors = authors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authors=" + authors + "]";
	}



	

}
