package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 3:14:47 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
* Java Program to demonstrate Single Inheritance
*/

public class ShoppingApplication {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart("Marry Jhon", "marry@wipro.com");
		
		cart.addItem("Dell Laptop");
		cart.addItem("Boat Headphone");
		cart.addItem("Logitech Mouse");
		
		cart.display();
		System.out.println("------------- Cart Details -----------------");
		cart.displayCart();
	}

}
