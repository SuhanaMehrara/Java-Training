package controlflow;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		int num,ans=1;
		System.out.println("Enter the number for factorial");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			ans=ans*i;
					
		}
		System.out.println(ans);
	}
}
