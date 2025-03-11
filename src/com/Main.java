package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Harry Java");
		Author author = new Author();
		author.setName("JK Schildt");
		book.setAuthor(author);
		
		System.out.println(book);
	}
}
