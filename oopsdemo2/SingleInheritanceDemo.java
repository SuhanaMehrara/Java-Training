/**
 * 
 */
package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 2:50:22 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

/**
 * 
 */
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		// Create objects of child class
		Developer d1 = new Developer(101, "James Gosling", "JDBC"); // Invoke derived class constructor
		Developer d2 = new Developer(105, "Rod Jhonson", "Spring Framework");
		
		d1.display(); // child class object invokes parent class method - inheritance
		d1.display1(); // child class object invoke child class method
		
		d2.display();
		d2.display1();
		
		Employee e1 = new Employee(106, "Mike");
		e1.display();
	}

}
