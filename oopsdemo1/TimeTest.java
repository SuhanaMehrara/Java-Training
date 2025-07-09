package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 12:15:24 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time(12,45,55);
		Time t2 = new Time(10,30,30);
		
		t1.addTime(t2);
		t1.display();

	}

}
