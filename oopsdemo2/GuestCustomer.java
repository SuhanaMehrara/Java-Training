package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 9:28:50 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class GuestCustomer extends Customer1 {
	
	private String[] cart;
    private int cartSize;
    private static final int MAX_CART_SIZE=5;
    
    
	public GuestCustomer(String name, String email) {
		super(name, email);
		this.cart=new String[MAX_CART_SIZE]; //Guest customer can add only 5 products to cart
        this.cartSize=0;
    }
	
	public void addToCart(String item) {
        if (cartSize < MAX_CART_SIZE) {
            cart[cartSize] = item;
            cartSize++;
            System.out.println(item + " added to cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void displayCart() {
        System.out.println("Items in Cart:");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(cart[i]);
        }
    }

}
