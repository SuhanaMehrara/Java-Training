package oopsdemo1;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 11:51:00 AM
* Email  : Vishal.1.Chauhan@coforge.com
* Program to add 2 complex numbers- Real & Imaginary part
*/

public class Complex {
	 double real;
	 double imaginary;
	 
	 public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	 }
	 
	 public void add(Complex obj) {   //method which accepts object as an argument
		 
		 //c1.real+=c2.real
		 this.real+=obj.real;
		 this.imaginary+=obj.imaginary;
	 }
	 public void display() {
		 System.out.println("r"+this.real+"+i"+this.imaginary);
	 }
}
