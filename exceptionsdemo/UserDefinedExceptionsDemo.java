package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:44:28 PM
* Email  : Vishal.1.Chauhan@coforge.com
* 
*/

public class UserDefinedExceptionsDemo {

	public static void main(String[] args) {
		CheckingAccount c1 = new CheckingAccount(1001, 20);

        System.out.println("Depositing 5000$ ...........");
        c1.deposit(5000);

        try{
            System.out.println("Withdrawing 2000$.........");
            c1.withdraw(2000);

            System.out.println("Withdrawing 5000$.........");
            c1.withdraw(5000);
        }
        catch (InsufficientFundsException e){
            System.out.println("Sorry InSufficient Balance : "+ c1.getBalance());
            e.printStackTrace();
        }
	}

}
