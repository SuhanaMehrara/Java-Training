package basics;

/*
 * Program to Calculate Simple Interest for a Loan Amount
 */
import java.util.*;
import java.io.*;
public class SimpleInterest1 {

	public static void main(String[] args) throws IOException {
		
		String customerName;
		double principal;
		float si;
		int term,rate;
		
		///Create scanner object for taking input at runtime
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		//Input
		System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
		System.out.println("Enter Customer Name : ");
		customerName=br.readLine();//Multiple words input
		System.out.println("Enter Loan Amount   : ");
		principal=Integer.parseInt(br.readLine());
		System.out.println("Enter Loan Term     : ");
		term=Integer.parseInt(br.readLine());
		System.out.println("Enter Rate of Interest :");
		rate=Integer.parseInt(br.readLine());
		
		//Calculate Simple Interest
		si=(float) (principal*term*rate)/100;
		
		//Output
		System.out.println("************ Loan Details ************************");
		System.out.println("Customer Name           : "+customerName);
		System.out.println("Principal Amount        : "+principal);
		System.out.println("Term                    : "+term);
		System.out.println("Rate of Interest        : "+rate);
		System.out.println("--------------------------------------------------");
		System.out.println("Simple Interest         : "+si);
		System.out.println("--------------------------------------------------");
	

	}
}