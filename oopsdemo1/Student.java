package oopsdemo1;

import java.util.Scanner;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 12:36:55 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
*/

// Instance class - Encapsulation
public class Student {
	
	// define properties/state/attributes
	private int rollNumber;
	private String firstName,lastName;
	private float[] marks = new float[5];
	private float total;
	
	Scanner input = new Scanner(System.in);
	
	// define methods/behaviors/actions
	public void inputStudentDetails() {
		System.out.println("Enter roll no of a student: ");
		rollNumber = input.nextInt();
		System.out.println("Enter First Name and Last Name: ");
		firstName = input.next();
		lastName = input.next();
		
		System.out.println("Enter marks of 5 Subjects: ");
		for(int i = 0; i < marks.length; ++i) {
			marks[i] = input.nextFloat();
		}
	}
	
	public float calculateTotalMarks() {
		for(int i=0;i<marks.length;i++) {
			total+=marks[i];
		}
		return total;
	}

	public void displayStudentDetails() {
		System.out.println("******************Student Result Information****************" );
		System.out.println("Roll Number                 :"+rollNumber);
		System.out.println("Student Name                :"+firstName+" "+lastName);
		System.out.println("Total Marks                 :"+total);
		System.out.println("*************************************************************");
	}
}
