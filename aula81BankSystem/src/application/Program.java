package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		Account account = new Account(accountNumber, accountHolder);

		
		System.out.println("Is there an initial deposit (y/n)? ");
		char choice = Character.toUpperCase(sc.next().charAt(0));
		
		if(choice == 'Y') {
			System.out.println("Enter initial deposit value:");
			double balance = sc.nextDouble();
			account.addValue(balance);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("Enter a deposit value: ");
		double addValue = sc.nextDouble();
		account.addValue(addValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdrawValue(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
