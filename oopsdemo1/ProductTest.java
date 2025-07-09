package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 4:24:45 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ProductTest {

	public static void main(String[] args) {
		Product p1=new Product(); // invoke default constructor 
		Product p2=new Product();
		
		p1.inputProductDetails();
		p1.calculateTotalBill();
		p1.displayProductDetails();
		
		p2.inputProductDetails();
		p2.calculateTotalBill();
		p2.displayProductDetails();
		
		
	}

}
