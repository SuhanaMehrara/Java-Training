package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 2:58:06 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Circle implements IShape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}
}
