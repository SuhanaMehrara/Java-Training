package oopsdemo4;

import java.util.Scanner;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 2:42:10 PM
 * Email  : Vishal.1.Chauhan@coforge.com
 */

public class SamsungCalculator implements ICalculator {
	Scanner kb;

	@Override
	public void add() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform Subtraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("SUbtraction of "+a+" and "+b+" is "+s);
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform Multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("Mul of "+a+" and "+b+" is "+s);
	}

	@Override
	public void div() {
		System.out.println("Enter any two integer values to perform Division");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("Div of "+a+" and "+b+" is "+s);
	}

	public void display() {
		System.out.println("My Calculator - Designed by Vishal");
	}


}
