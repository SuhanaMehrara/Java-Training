package exceptionsdemo;

import java.util.Scanner;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 10:29:54 AM
* Email  : Vishal.1.Chauhan@coforge.com
* program to perform division of 2 nos without exception handling
*/

public class Division {
	public static void main(String[] args) {
		 int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  
		 result = a / b;  // JRE Throws Arithmetic exception
		 
		 System.out.println("Result = " + result);  
		 input.close();
	}
}
