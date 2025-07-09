package oopsdemo2;

import java.util.Scanner;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 4:31:48 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class MultiLevelDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account details of a customer(Cust No,Name,Balance):");
		int custNo = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int balance = sc.nextInt();
		final int MIN_BAL = 1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit = sc.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw = sc.nextInt();
		AccountDetails ac1 = new AccountDetails(custNo, name, MIN_BAL,balance,deposit,withdraw);
		
		ac1.display();
	}

}
