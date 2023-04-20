package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Account(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double deposit) {
		accountBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		accountBalance = (accountBalance - withdraw) -5;
	}
	
	public String toString() {
		return "Account "
			   + getAccountNumber()
			   + ", Holder: "
			   + getAccountHolder()
			   + ", Balance: $ "
			   + String.format("%.2f", getAccountBalance());
	}
	
}
