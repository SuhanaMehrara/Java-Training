package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 3:01:28 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Rectangle implements IShape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}
	@Override
	public double getArea() {
		return this.height * this.width;
	}
	
	
}
