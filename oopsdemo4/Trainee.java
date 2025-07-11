package oopsdemo4;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 11:44:02 AM
 * Email  : Vishal.1.Chauhan@coforge.com
 */

public abstract class Trainee {
	private String name;
	private String address;
	private int number;

	public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	// abstract method declaration - must be overridden in the derived class
	public abstract double calculateMarks();

	void show()
	{
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}

}
