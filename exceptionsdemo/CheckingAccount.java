package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:39:26 PM
* Email  : Vishal.1.Chauhan@coforge.com
*/

public class CheckingAccount {
	private double balance;
    private int number;
    
	public CheckingAccount(double balance, int number) {
		this.balance = balance;
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
	}
}
