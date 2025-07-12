package exceptionsdemo;

/**
* Author : Vishal.1.Chauhan
* Date   : Jul 12, 2025
* Time   : 12:36:35 PM
* Email  : Vishal.1.Chauhan@coforge.com
* User Defined Exceptions -- Class should extend root class Exception
*/

public class InsufficientFundsException extends Exception {

	double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	

}
