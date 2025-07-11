package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 10:25:31 AM
* Email  : Vishal.1.Chauhan@coforge.com
* Final Variable- Variable content cannot be modified
 * Final method - A final method cannot be overridden
 * Final class - Cannot extend a Final class
 

*/
final class Demo{
	final void display(){
        System.out.println("Hello World");
    }
}
class MyDemo extends Demo{
	void display() {
		System.out.println("Final Variables");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		  final int AGE=20;
		  AGE = 25;

	}

}
