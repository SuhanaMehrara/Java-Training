package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 10:44:54 AM
* Email  : Vishal.1.Chauhan@coforge.com
*/

//General Exception handling

public class ExceptionDemo {

	public static void main(String[] args) {
		

		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
			
			try
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println(languages[i]);
				}
			}
			catch(Exception ex)
			{
				System.err.println(ex);
			}

	}

}
