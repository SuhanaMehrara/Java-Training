package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
public class Discount {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
        String name;
        int age;
        boolean isMember;

        //Ask user for Membership Status
        System.out.println("Enter Your Name :");
        name=br.readLine();
        System.out.println("Enter Your Age: ");
        age=Integer.parseInt(br.readLine());
        System.out.println("Are You a Member ? : (true/false)");
        isMember=Boolean.parseBoolean(br.readLine());

        //Check if the user is eligible for discount
        if(age < 18 || !isMember) { //Not operator Negates the Condition
            System.out.println(name+" is Eligible for Discount !!!");
        }
        else {
            System.out.println(name+" is Not Eligible for Discount !!!");
        }	
	}
}

