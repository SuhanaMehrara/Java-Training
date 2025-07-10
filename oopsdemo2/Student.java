package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 10, 2025
* Time   : 10:10:03 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class Student {
	int rollNo;
	String name;
	
	Address ad; // Entity Reference -Aggregation - has a relationship

	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	  void display()
	  {
			System.out.println("---------- Student Details ------------");
			System.out.println("Student Id   :"+rollNo );
		    System.out.println("Student Name :"+name);
		    
		    System.out.println("Address: " + ad.city + " " + ad.state + " " + ad.country + " " + ad.pincode);
	  }
	
	
}
