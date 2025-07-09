package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 3:03:58 PM
* Email  : Vishal.1.Chauhan@coforge.com
* Single Inheritance Demo
*/

public class Customer {
	private String name;
    private String email;


	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
    
    
}
