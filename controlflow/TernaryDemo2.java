package controlflow;
import java.util.*;
public class TernaryDemo2 {
   public static void main(String[] args)
   {
	   /**
	    * Program to Check alphabet using Ternary Operator
	    */
	    
	    
	   			char myChar;
	           Scanner scanner=new Scanner(System.in);

	           System.out.println("Enter a Character :");
	           myChar=scanner.next().charAt(0); // Take Single character Input

	           // Ternary Operator
	           String output=(myChar >='a' && myChar <='z') || (myChar >='A' && myChar <='Z') ?
	                           myChar+" is an Alphabet":myChar+" is not an Alphabet";
	           System.out.println(output);
   }
}
