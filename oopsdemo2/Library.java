package oopsdemo2;

import java.util.List;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 12:44:33 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

// Composition Example
public class Library {
	List<Book> books;  //Object Reference -- Composition
	
	// constructor to initialize books in library
	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	
	// getter() method to getBooks in library
	public List<Book> getBooks() {
		return books;
	}
	
	
}
