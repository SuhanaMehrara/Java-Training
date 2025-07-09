package oopsdemo2;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 9, 2025
* Time   : 4:28:48 PM
* Email  : Vishal.1.Chauhan@coforge.com
* /* Multi Level Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
 */

//child class of Savings Bank
public class AccountDetails extends SavingsBank{
	int withdrawl,deposit,finalBalance;

	public AccountDetails(int accNo, String name, int min_bal, int balance, int withdrawl, int deposit) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = withdrawl;
		this.deposit = deposit;
	}
	

    void display()
       {
            super.display(); // invokes savings bank display()method
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance:" + finalBalance);
       }
}
