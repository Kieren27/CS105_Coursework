/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise23
 * @author Kieren Enright
 */
package edu.sbcc.cs105;
/**
 * BankAccount class uses BankAccount interface
 * 
 */
public class BankAccount implements Comparable<BankAccount> {

	private String accountNumber; // for setting account number
	private String firstName; // for setting account first name
	private String lastName; // for setting account last name
	private double balance; // for setting account balance

	/**
	 * 
	 * @param a sets account number (String)
	 */
	public void setAccountNumber(String a) {
		this.accountNumber = a;
	}

	/**
	 * 
	 * @return the set account number (String)
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * 
	 * @param fn sets the account's first name (String)
	 */
	public void setFirstName(String fn) {
		this.firstName = fn;
	}

	/**
	 * 
	 * @return account's first name (String)
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param ln sets the account's last name (String)
	 */
	public void setLastName(String ln) {
		this.lastName = ln;
	}

	/**
	 * 
	 * @return account's last name (String)
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param b sets the account's balance (double)
	 */
	public void setBalance(double b) {
		this.balance = b;
	}

	/**
	 * 
	 * @return the account's balance (double)
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Compares two bank accounts' balances
	 */
	public int compareTo(BankAccount otherAccount) {

		if (balance < otherAccount.balance)
			return -1;

		if (balance > otherAccount.balance)
			return 1;

		return 0;
	}

	/**
	 * Prints all nescessary account info
	 */
	public void printAccountInfo() {
		System.out.printf("Account info: %s %s, Account# %s, Balance: $%.2f\n", getFirstName(), getLastName(), getAccountNumber(), getBalance());
	}
}