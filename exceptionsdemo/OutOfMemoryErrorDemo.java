package exceptionsdemo;

import java.io.IOException;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:49:08 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
* Error is used by the Java run-time system (JVM) to indicate errors
 *  that are associated with the run-time environment (JRE).
 *  Errors are caused due to Java environment 
 
*/

public class OutOfMemoryErrorDemo {
	
	public void createArray(int size)
	{
		try
		{
			Integer[] a=new Integer[size];
			System.out.println("Array Created");
		}
		/* System.err is a PrintStream. System.err works like System.out except it is normally only used
		 *  to output error texts. Some programs (like Eclipse) will show the output to System.err in 
		 *  red text, to make it more obvious that it is error text.*/
		catch(OutOfMemoryError e)
		{
			System.err.println("Array Size too Large "+e);
			System.err.println("Max JVM Memory: "+Runtime.getRuntime().maxMemory());
			System.out.println("Java Version :"+Runtime.version());
				
		}
	}

	public static void main(String[] args) {
OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		
		d1.createArray(1000*1000*1000);
		
		
		try {
			Runtime.getRuntime().exec("mpaint");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
