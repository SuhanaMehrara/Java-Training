package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 2:41:38 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Employee {
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	 void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}
	
	
}
