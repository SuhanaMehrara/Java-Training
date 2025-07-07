package basics;
/*
 * Java program to perform arithmetic operations using BufferedReader input
 * */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Arithmetic {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int num1,num2,sum,sub,mul;
		float div;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter Your Name: ");
		String name = br.readLine();
		
		System.out.println("Enter 2 Numbers: ");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (float)num1/num2;
		
		System.out.println("******* Arithmetic Operations ********");
		System.out.println("The Addition is " + sum);
		System.out.println("The subtractions is " + sub);
		System.out.println("The multiplication is " + mul);
		System.out.println("The division is " + div);
		System.out.println("*****************"+ name+ "*************************");
		
	}

}
