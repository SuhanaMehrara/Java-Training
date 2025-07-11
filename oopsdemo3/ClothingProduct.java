package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 9:24:09 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ClothingProduct extends Product {
	private  String size;
    private String color;
    
	public ClothingProduct(String size, String color,String name,double price) {
		super(name,price);
		this.size = size;
		this.color = color;
	}
	
	public void displayDetails(){
		super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: Cotton");
	}
    
    
}
