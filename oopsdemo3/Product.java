package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 9:23:30 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}