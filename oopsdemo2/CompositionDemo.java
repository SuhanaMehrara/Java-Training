package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 12:30:02 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

class Honda extends Car{
	public void hondaStart() {
		Engine heng=new Engine(); // composition - Honda class fully dependent on engine
		heng.startEngine();
	}
}

class Hyundai extends Car{
	public void hyundaiStart()
	{
		Engine heng = new Engine();
		heng.startEngine();
	}
}

public class CompositionDemo {
	public static void main(String[] args) {
        Honda hondaCity =new Honda();
		
		hondaCity.setColor("Silver"); //car class methods
		hondaCity.setMax_speed(180);	//car class methods
		
		System.out.println("*******Honda Car Details *********");
		System.out.println(hondaCity.getColor() +" Color");//car class methods
		System.out.println(hondaCity.getMax_speed()+" Speed");//car class methods
		
		hondaCity.hondaStart(); // honda class method-- > call ENgine class method
		
		//hondaCity=null;
		System.gc();
		System.out.println(hondaCity.getColor());
		
		
		Hyundai h =new Hyundai();
		
	    hondaCity.setColor("Silver");
		hondaCity.setMax_speed(180);	
		
		System.out.println("*******Honda Car Details *********");
		System.out.println(hondaCity.getColor() +" Color");
		System.out.println(hondaCity.getMax_speed()+" Speed");
		
		hondaCity.hondaStart();
	}
}
