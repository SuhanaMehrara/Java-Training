package oopsdemo2;

import java.util.ArrayList;
import java.util.List;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 12:50:20 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class LibraryCompositionDemo {

	public static void main(String[] args) {
		// Creating the Objects of Book class. 
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch"); 
        Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
          
        // Creating the list which contains the  
        // no. of books. 
        List<Book> books = new ArrayList<Book>(); 
        books.add(b1); 
        books.add(b2); 
        books.add(b3); 
        
        //Library object with books List initialized
        Library lib=new Library(books);
        
        //get the Book List
        List<Book> bks = lib.getBooks(); 
        
        for(Book bk : bks){ 
              
            System.out.println("Title : " + bk.title + " and " 
            +" Author : " + bk.author); 
	}

//        lib=null;
//        System.gc();
        System.out.println(lib.getBooks());
        System.out.println(b1.author);
	}

}
ffffffffffffffffffffffffffffff