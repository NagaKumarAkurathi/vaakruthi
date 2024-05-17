package com.vaakruthi.oops;
/**
 * Step1:Declare variables as private
 * Step2:Provide access to the variables through public methods(including constructors)
 * Step3:Define validation code inside the method
 */
public class Encapsulation {
 public static void main(String[] args) {
	BankAccount ba = new BankAccount();
	ba.deposit(1200);
}
}
 class BankAccount{
	 private int balance;
	 public void deposit(int amount)
	 {
		 if(amount>0) {
			 balance = amount;
			 System.out.println("Deposited successfully...");
		 }
		 else {
			 System.err.println("Invalid amount..");
		 }
	 }
 }

