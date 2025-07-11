package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 11:47:08 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Marks extends Trainee {
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Calculate Marks :");
		return (marks * 2);
	}
	
	
}
