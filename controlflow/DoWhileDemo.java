package controlflow;
import java.util.*;
public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Enter a Number : ");
            number=scanner.nextInt();
            System.out.println(number);
        }while(number>0);

        System.out.println("The Entered Number is : "+number);

	}

}
