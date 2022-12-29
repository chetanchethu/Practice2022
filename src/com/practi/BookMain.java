package com.practi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookMain {

	public static void main(String[] args) {
		List<Book> books=Arrays.asList(
		(new Book(1, "zero to one",Arrays.asList("A1","A2"))),
				(new Book(2, "wall street",Arrays.asList("A4","A3"))),
				(new Book(3, "book1",Arrays.asList("A7","A2"))),
				(new Book(4, "book3",Arrays.asList("A4","A3")))
						);
		List<Book> res=new ArrayList<Book>();
//		for (int i = 0; i <books.size(); i++) {
//			if(books.get(i).getAuthors().contains("A4")) {
//				res.add(books.get(i));
//			}
//		}
		System.out.println(res);

		for (int i = 0; i <books.size(); i++) {
			if(books.get(i).getAuthors().contains("A4")) {
				res.add(books.get(i));
			}
		}
		
	
	//System.out.println(bookList);
	}

}
