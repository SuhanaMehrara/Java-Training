package controlflow;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to find Sum of Series 1+2+3+....+n


		int num,i=1,sum=0;
				Scanner scan =new Scanner(System.in);
				
				System.out.println("Enter a limit :");
				num=scan.nextInt();
				scan.close();
				
				while(i<=num) {
					sum=sum+i;
					
					i=i+1;
					System.out.println("The Sum of Series is : "+sum);
				}
				//System.out.println("The Sum of Series is : "+sum);

	}

}
