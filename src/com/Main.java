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
		
		
		Book book1 = new Book();
		book1.setTitle("baba bazuka");
		Author author1 = new Author();
		author1.setName("Fsociety");
		book1.setAuthor(author1);
		
		System.out.println(book1);
	}
}
