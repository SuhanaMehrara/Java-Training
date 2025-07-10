package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 9:26:49 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Customer1 {

	private String name;
	private String email;
	
	public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
	
}
