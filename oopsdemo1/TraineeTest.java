package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 11:39:32 AM
* Email  : Vishal.1.Chauhan@coforge.com
* Java program to demonstrate constructors
*/

public class TraineeTest {

	public static void main(String[] args) {
		Trainee t1 = new Trainee();
		t1.display();
		
		Trainee t2 = new Trainee(222,"Rod johsnson","Spring",7000);
		t2.display();
		
		Trainee t3 = new Trainee(333,"Gavin","React",6000);
		t3.display();
		
		Trainee t4 = new Trainee(333,"Gavin","React",6000);
		t4.display();
		
		if(t3.equals(t4)) {
			System.out.println("Object t3 and t4 are eqaul");
		}else {
			System.out.println("Object t3 and t4 are not equal");
		}
		
		if(t3.equals(t1)) {
			System.out.println("Object t3 and t1 are eqaul");
		}else {
			System.out.println("Object t3 and t1 are not equal");
		}

		
		
	}

}
