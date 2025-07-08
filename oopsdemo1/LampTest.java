package oopsdemo1;
//Java program to implement instance class and main class in a single file
/**
* Author : Vishal.1.Chauhan
* Date   : Jul 8, 2025
* Time   : 2:52:05 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/
class Lamp{
	boolean isOn;
	
	void turnOn(){
		isOn =true;
		System.out.println("Light On?" +isOn);
	}
	
	void turnOff(){
		isOn=false;
		System.out.println("Light On?" +isOn);
	}
}
public class LampTest {

	public static void main(String[] args) {
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		led.turnOn();
		halogen.turnOn();
		
		led.turnOff();
		halogen.turnOff();

	}

}
