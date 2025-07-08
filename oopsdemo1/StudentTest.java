package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 12:55:09 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1=s1.calculateTotalMarks();
		float tot2=s2.calculateTotalMarks();
		float tot3=s3.calculateTotalMarks();
		
		s1.displayStudentDetails();
		System.out.println("Display total marks returned to main: "+tot1);
		s2.displayStudentDetails();
		System.out.println("Display total marks returned to main: "+tot2);
		s3.displayStudentDetails();
		System.out.println("Display total marks returned to main: "+tot3);


	}

}
