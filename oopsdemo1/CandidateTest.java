package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 12:42:50 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class CandidateTest {

	public static void main(String[] args) {
        Candidate cd1=new Candidate(101,"James Gosling",5000.00f);
		
		Candidate cd2=new Candidate(102,"Navin Kumar",6000.00f);
		
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();

	}

}
