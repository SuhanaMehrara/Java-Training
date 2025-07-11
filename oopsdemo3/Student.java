package oopsdemo3;

/**
 * Author : Vishal.1.Chauhan
 * Date   : Jul 11, 2025
 * Time   : 10:14:40 AM
 * Email  : Vishal.1.Chauhan@coforge.com
 */

public class Student {
	private int rollNo;
	private String name;
	private static  String college="UPES";



	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void collegeChange(){ //static Method
		college="VTU";
	}

	public void display(){
		System.out.println(this.rollNo+" "+this.name+" "+college);
	}
}
