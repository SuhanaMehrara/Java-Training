package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 9:26:54 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class OverideDemo3 {

	public static void main(String[] args) {
		ElectronicsProduct laptop=new ElectronicsProduct("Laptop",999.90,"Dell","Inspiron");
        ClothingProduct tShirt=new ClothingProduct("T-Shirt","Red","Medium",15.45);

        System.out.println("-- Electronics Product Details ---");
        laptop.displayDetails();

        System.out.println("-- Clothing Product Details ---");
        tShirt.displayDetails();

	}

}
