package basics;
/*
 * Program to find sum and average of 3 numbers
 */
import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,sum;
		float avg;
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name: ");
		name = sc.next();
		
		System.out.println("Enter 3 Numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		avg = (float)sum / 3;
		
		System.out.println("The sum of3 numbers is " + sum);
		System.out.println("The average of 3 Numbers is" + avg);
		System.out.println("Program created by " + name+" Thanks");
		
		sc.close();
	}

}
