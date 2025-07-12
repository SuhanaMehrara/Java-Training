package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 10:52:32 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2=null;
		try
		{
		System.out.println(s1.length());
		System.out.println(s2.length());
		}
		catch(Exception a)
		{
			System.err.println("Exception occured :"+a);
			//throw new NullPointerException("String is Empty");
		}

	}

}
