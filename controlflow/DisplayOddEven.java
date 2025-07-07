package controlflow;

import java.util.Scanner;

public class DisplayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,i=1;
		System.out.println("Enter limit");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		System.out.println("Odd     Even");
		System.out.println("---     ----");
		while(i<=limit)
		{
			if(i%2==0)
			{
				System.out.print(" "+i+"\n");
			}
			else
				System.out.print(i+"\t");
			i+=1;
		}

	}

}
