package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 2:43:39 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/
//main class to test Employee class methods
public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee(); // invoke default constructor 
		Employee e2=new Employee();
		Employee e3=new Employee();
		
				
		//invoke Methods (Method call)
		e1.inputEmployeeDetails(); // p1.eat();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();

	}

}
