package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 4:23:57 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
* Multilevel Inheritance
*/

public class Account {
	int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
