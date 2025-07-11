package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 3:18:08 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

// Implement Multiple Inheritanceclass Result extends Candidate implements IExam{
	
	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("*********** candidate Result *****************");
	}

	@Override
	public void percent_cal() {
		int total = (mark1 + mark2);
		float percent = total * 100/200;
		System.out.println("Percentage: " + percent + "%");
		
	}
	
}

public class MultipleDemo {

	public static void main(String[] args) {
		Result r1 = new Result("John", 101, 92, 85);
		r1.display();
		r1.percent_cal();

	}

}
