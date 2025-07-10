package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 9:23:44 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class HierarchialDemo {

	public static void main(String[] args) {
		Specialist spObj=new Specialist(1001,"Mary King","NewYork","Cardiologist");
        spObj.display();

        NonSpecialist nspObj=new NonSpecialist(2001,"Navin Kumar","Mumbai");
        nspObj.display();

	}

}
