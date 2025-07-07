package controlflow;

public class TernaryDemo {
   public static void main(String[] args)
   {
	   /**
	    * Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
	    * It Takes 3 Operands
	    * Syntax: variable = condition ? expr1 : expr2
	    *
	    * Program to find Max of 2 Numbers
	    */
	    
	    
	   		   int a=1110,b=220,max;

	           System.out.println("First Number :"+a);
	           System.out.println("Second Number :"+b);

	           //Ternary Operation
	           String msg = (a > b) ? "A is Greatest" : "B is Greatest";
	           System.out.println(msg);

	           max =(a>b) ? a:b;
	           System.out.println("The Maximum of 2 Nos is :"+max);
   }
}
