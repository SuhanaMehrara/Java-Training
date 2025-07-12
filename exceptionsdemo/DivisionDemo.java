package exceptionsdemo;

import java.util.Scanner;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 10:29:54 AM
* Email  : Vishal.1.Chauhan@coforge.com
* program to perform division of 2 nos without exception handling
*/

public class DivisionDemo {
	public static void main(String[] args) {
		 int a, b, result;
		 Scanner input = new Scanner(System.in);
		 
		  System.out.println("Input two integers");
		  a = input.nextInt();
		  b = input.nextInt();  // enter 0
		  
		  try {
			  result = a / b;  // JRE Throws Arithmetic exception
			  System.out.println("Result = " + result);  
		  }catch(ArithmeticException e) {
			  System.err.println("Divide by Zero Error - Enter non zero value");
			  System.err.println("Exception Description :"+e.getMessage());
			  System.err.println("Exception Name & description :"+e.toString());
			  e.printStackTrace();
		  }finally {          //clean-up operations
			  input.close();
			  System.out.println("In finally block - Program Execution ended");
		  }
	}
}
