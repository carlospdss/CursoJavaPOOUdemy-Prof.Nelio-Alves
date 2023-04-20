package entities;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
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
	
	public double getBalance() {
		return balance;
	}
	
	public double addValue(double addValue) {
		return balance += addValue;
	}
	
	public double withdrawValue(double withdrawValue) {
		return balance -= withdrawValue + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ getAccountNumber()
				+ ", "
				+ "Holder: "
				+ getAccountHolder()
				+ ", "
				+ String.format("Balance: $ %.2f%n", getBalance());
	}
}
