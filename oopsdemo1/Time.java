package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 12:11:05 PM
* Email  : Vishal.1.Chauhan@coforge.com
* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
*/

public class Time {
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
		System.out.println("The time is " + this.hrs + " " + this.min + " " + this.sec);
	}

	public void addTime(Time obj) {
		System.out.println(obj.hrs + " " + obj.min+ " " + obj.sec);
		System.out.println(this.hrs + " " + this.min + " " + this.sec);
		if(this.sec + obj.sec > 60) {
			this.min++;
			this.sec = (this.sec + obj.sec) - 60;
		}
		
		if(this.min + obj.min > 60) {
			this.hrs = this.hrs + obj.hrs + 1;
			this.min = (this.min + obj.min) - 60;
		}else {
			this.min = this.min + obj.min;
			this.sec = this.sec + obj.sec;
		}
	}
	
	public void display() {
		System.out.println("The time is " + this.hrs + " " + this.min + " " + this.sec);
	}
	
	
	
}
