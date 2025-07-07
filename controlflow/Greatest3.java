package controlflow;

import java.util.Scanner;

public class Greatest3 {
    public static void main(String[] args)
    {
    	int a,b,c;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a , b , c:");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	c=sc.nextInt();
    	if(a>b && a>c)
    	{
    		System.out.println(a+"is greatest");
    		
    	}
    	else if(b>a && b>c)
    	{
    		System.out.println(b+"is Greatest");
    	}
    	else if(c>a && c>b)
    		System.out.println(c+"is greatest");
    	else{
			  System.out.println("All are equal");	
			}
    	sc.close();
    }
}
