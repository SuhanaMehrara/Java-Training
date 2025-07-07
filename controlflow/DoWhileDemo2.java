package controlflow;

import java.util.Scanner;

public class DoWhileDemo2 {
	public static void main(String[] args)
	{
		int i=20;

        do{
            System.out.print(i+"\t");
            i=i+1;
        }while (i<=50);

        System.out.println("***************** Guess Names *******************");
        String guess;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Guess My Name : ");
            guess=scanner.next();
        }
        while (!"James".equals(guess));
        System.out.println("Congratulations You Guessed Name Correctly!!! "+guess);
	}
}
