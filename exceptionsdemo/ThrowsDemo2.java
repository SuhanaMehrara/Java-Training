package exceptionsdemo;

import java.util.Scanner;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:30:52 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class ThrowsDemo2 {

	public static int divideAndMod(int a,int b) throws ArithmeticException,IllegalArgumentException {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero not Allowed");
        }
        if (b < 0) {
            throw new IllegalArgumentException("Divisor Cannot be Negative");
        }
        return a/b;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try{
            int result=divideAndMod(num1,num2);
            System.out.println("Result of Division is : "+result);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
    }
	}

}
