package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 12:17:00 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class AggregationDemo1 {

	public static void main(String[] args) {
        Author author = new Author("John", 42, "USA");
		
	    Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");
	    
	    Book100 b = new Book100("Java for Begginers", 800, author, publisher);
	    
	    b.display();

	}

}
