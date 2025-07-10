package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 10:15:09 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1 = new Address("Bengalauru", "Karnatka", "India", 566016);
		Address ad2 = new Address("Prague", "Austin", "Czech Republic", 77777);
		
		Student s1 = new Student(101, "Ravi", ad1);
		Student s2 = new Student(102, "Mike", ad2);
		
		s1.display();
		s2.display();

	}

}
