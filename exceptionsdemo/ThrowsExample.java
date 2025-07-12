package exceptionsdemo;

import java.io.IOException;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:27:09 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ThrowsExample {

	void myMethod(int a) throws IOException,ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception Ocurred");
		else
			throw new ArithmeticException("Arithmetic Exception");
	
	
	}
	public static void main(String[] args) {
		
ThrowsExample t=new ThrowsExample();
		
		try {
			t.myMethod(1);
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		

		
	}
}
	
