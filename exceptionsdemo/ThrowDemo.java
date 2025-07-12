package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:11:17 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ThrowDemo {
	public static void hello(int a) {
		if(a == 0) {
			throw new ArithmeticException("Pass Non Zero Values"); // exception thrown manually
		}else {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		hello(100);
		hello(0);
	}
}
