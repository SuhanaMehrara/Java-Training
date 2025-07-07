package controlflow;

import java.util.Scanner;

public class SumPositive {
	public static void main(String[] args)
	{

		 int sum=0,number=0;
		        Scanner input =new Scanner(System.in);

		// Loop continues until entered number is Positive
		        while(number>=0){
		            sum +=number;
		            System.out.println("Enter a Number : ");
		            number=input.nextInt();
		        }
		        System.out.println("The Sum of Positive Nos is : "+sum);
		        input.close();
	}

}
