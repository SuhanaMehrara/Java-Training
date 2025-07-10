package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 12:43:13 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Book {
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}
