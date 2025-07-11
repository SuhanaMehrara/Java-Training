package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 10:17:18 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class StaticDemo2 {
	public static void main(String[] args) {
		Student.collegeChange();
		
		Student s1 = new Student(101, "Mike");
		Student s2 = new Student(102, "John");
		Student s3 = new Student(103, "Marry");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
