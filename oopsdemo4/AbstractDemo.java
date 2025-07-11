package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 11:52:44 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class AbstractDemo {

	public static void main(String[] args) {
		Trainee t1 = new Marks("John", "New York", 1001, 35); // up casting
		
		t1.show(); // invoke abstract base class method
		double marks = t1.calculateMarks(); // invoke sub class method
		System.out.println(t1 + " " + marks);

	}

}
