package controlflow;

import java.util.Scanner;

public class OddEven {
   public static void main(String[] args)
   {
	   int num1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   num1=sc.nextInt();
	   if(num1%2==0)
		   System.out.println(num1+"is Even");
	   else
		   System.out.println(num1+"is ODD");
   }
}
