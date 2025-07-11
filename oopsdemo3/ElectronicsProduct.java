package oopsdemo3;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 9:23:56 AM
 * Email  : Vishal.1.Chauhan@coforge.com
 */

public class ElectronicsProduct extends Product {
	private String brand;
	private String model;

	public ElectronicsProduct(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Warranty: 1 year");
	}
}
