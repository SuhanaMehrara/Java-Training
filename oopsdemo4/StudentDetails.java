package oopsdemo4;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 11, 2025
* Time   : 4:11:50 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
* // multiple Interface implementation - multiple inheritance
// StudentDetails class implements abstract methods of 2 Interfaces
*/

public class StudentDetails implements ICollegeData,Hosteldata {
	
	College c1 = new College("mary",500, "DU", "MCA");
	Hostel h1 = new Hostel("Ram", "Block A");

	@Override
	public void hostelDetail() {
		System.out.println("********** Hostel Details *********");
		System.out.println("Hostel Name :"+h1.getName());
		System.out.println("Location    :"+h1.getLocation());
		
	}

	@Override
	public void studentRecord() {
		 System.out.println("Students Selected based on Percentage & Financial Condition");
		
	}

	@Override
	public void collegeDetail() {
		System.out.println("********** College Details *********");
		System.out.println("College Name : "+c1.getName());
		System.out.println("College Id   : "+c1.getId());
	//	System.out.println("Course       : "+c1.getCourse());
		System.out.println("University   : "+c1.getUniversty());
	}

	@Override
	public void studentData() {
		System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");
		
	}
	
}
