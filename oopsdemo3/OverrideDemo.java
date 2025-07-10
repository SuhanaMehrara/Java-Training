package oopsdemo3;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 3:53:16 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

class Bank{
	private String name;
	
	
	public Bank(String name) {
		this.name = name;
	}
	int getRateOfInterest() {
		return 0;
	}
	void display(){
        System.out.println("Welcome to "+name+" Bank");
    }
}

class SBI extends Bank
{
	
	public SBI(String name) {
		super(name);
	}

	int getRateOfInterest()
	{
		return 5;
	}
}


class ICICI extends Bank
{
	
	public ICICI(String name) {
		super(name);
	}

	int getRateOfInterest()
	{
		return 7;
	}
}

class Axis extends Bank
{
	
	public Axis(String name) {
		super(name);
	}

	int getRateOfInterest()
	{
		return 6;
	}
}


public class OverrideDemo {
	public static void main(String[] args) {
		 SBI sbiBank=new SBI("SBI");
	        ICICI iciciBank=new ICICI("ICICI");
	        Axis axisBank=new Axis("Axis");

	        sbiBank.display();
	        System.out.println("The Interest Rate of SBI is : "+sbiBank.getRateOfInterest()); // invoke overridden method

	        iciciBank.display();
	        System.out.println("The Interest Rate of ICICI is : "+iciciBank.getRateOfInterest());

	        axisBank.display();
	        System.out.println("The Interest Rate of Axis is : "+axisBank.getRateOfInterest());
	}
	
}
