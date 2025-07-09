package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 10:18:52 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ThisDemo {
	int age;
	
	void init(int age) {
		this.age=age;
	}
	

	public static void main(String[] args) {
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		
		System.out.println("the value of age is:" +td1.age);
		
		ThisDemo td2=new ThisDemo();
		td2.init(40);
		
		System.out.println("The value of age is:" +td2.age);		

	}

}
