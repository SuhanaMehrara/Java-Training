package controlflow;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=1;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(i<=10)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i+=1;
		}

	}

}
