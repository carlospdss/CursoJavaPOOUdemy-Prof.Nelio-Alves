package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println("Is there an initial deposit(y/n)? ");
		char initialDeposit = sc.next().toLowerCase().charAt(0);
		double initialDepositValue = 0;
		if(initialDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
			account = new Account(accountNumber, accountHolder);
		}
		else {
			account = new Account(accountNumber, accountHolder, initialDepositValue);
		}
		
			
			System.out.println("Account data:\n" + account + "\n");
		
		
		System.out.println("Enter a deposit Value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: \n" + account.toString()+ "\n");
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: \n" + account.toString());
		
		sc.close();
	}
}
