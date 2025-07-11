package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 10:03:24 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

class Count{
	private static int cnt;
	private int a;
	
	Count(){
		cnt++;
		a = 100;
	}
	
	public static void display() {
		System.out.println("The number of objects created: "+cnt);
	}
	
	public void print()
	{
		System.out.println("Instace Method Varibale : "+a);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.print();
		
		Count.display();
		
		
	}
}
