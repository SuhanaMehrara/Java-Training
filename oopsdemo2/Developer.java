package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 2:43:52 PM
* Email  : Vishal.1.Chauhan@coforge.com
* Child class - Inheritance IS-A relationship
*/

public class Developer extends Employee {
	 private String technology;
	 
   // Generate constructor using fields
	public Developer(int empId, String name, String technology) {
		super(empId, name);  // Invokes base class constructor
		this.technology = technology;
	}
	
	void display1() {
		System.out.println("Technology Used: "+technology);
		
	}
	
	
}
