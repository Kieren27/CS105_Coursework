package edu.sbcc.cs105;

public class BankAccountInt implements Comparable<BankAccount> {

	double balance;

	public void setBalance(double b) {
		balance = b;
	}

	public double getBalance() {
		return balance;
	}

	public int compareTo(BankAccount otherAccount) {

		if (balance < otherAccount.balance)
			return -1;

		if (balance > otherAccount.balance)
			return 1;

		return 0;

	}
}
