package controlflow;
import java.util.*;
public class SingleDigit {
	public static void main(String[] args) {
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     num=sc.nextInt();
     if(num<10 && num>-10 )
    	 System.out.println(num+"is Single digit");
     else {
    	 System.out.println(num+"is Not Single digit");
     }
	} 
}
