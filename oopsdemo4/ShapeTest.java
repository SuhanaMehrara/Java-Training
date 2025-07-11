package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 3:06:05 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ShapeTest {

	public static void main(String[] args) {
		IShape sh = new Circle(10); // upcasting
		
		System.out.println("Using Interface :"+sh.LABLE);
		
		sh.draw();
		
		System.out.println("Area of circle with radius is :" + sh.getArea());
		
		sh = new Rectangle(10, 7);
		
		sh.draw();
		System.out.println("Area of Rectangle is :"+sh.getArea());

	}

}
