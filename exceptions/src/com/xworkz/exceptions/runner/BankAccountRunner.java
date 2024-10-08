package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.target.InsufficientFundException;

public class BankAccountRunner {
public static void main(String[] args) {
	BankAccount account = new BankAccount();

    try {
    	
        ( account).withdraw(150); 
    } catch (InsufficientFundException e) {
        System.out.println("Caught InsufficientFundsException: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Caught IllegalArgumentException: " + e.getMessage());
    }
}

	
	
	 public void withdraw(double amount) throws InsufficientFundException {
		
	        double balance = 0;
			if (amount > balance) {
	            throw new InsufficientFundException("Insufficient funds! You tried to withdraw :" + amount);
	        } else if (amount < 0) {
	            throw new IllegalArgumentException("Withdrawal amount cannot be negative!");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful! New balance: " + balance);
	        }
	    }


}

