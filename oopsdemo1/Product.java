package oopsdemo1;

import java.util.Scanner;

//Java OOP to enter ProuctId,Name,price & qty,calculate the total bill
/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 4:12:58 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Product {
	private int ProductId;
	private String Name;
	private int price;
	private int qty;
	private int total;
	
	Scanner input = new Scanner(System.in);
	
	// define methods/behaviors/actions
	public void inputProductDetails() {
		System.out.println("Enter Product ID, Name, Price & Quantity :");
		ProductId = input.nextInt();
		Name = input.next();
		price = input.nextInt();
		qty = input.nextInt();
	
	}
	
	public void calculateTotalBill() {
		total = price * qty;
	}

	public void displayProductDetails() {
		System.out.println("************* Product Details ***************");
		System.out.println("Product Id is " + ProductId);
		System.out.println("Name is " + Name);
		System.out.println("Price is " + price);
		System.out.println("Quantity is " + qty);
		System.out.println("Total is " + total);
	}
}


