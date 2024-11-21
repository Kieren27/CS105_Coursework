package edu.sbcc.cs105;


/**
 * Defines the interface for a bank account.
 * 
 */
public interface BankAccountInt {


	/**
	 * Returns the account number of this bank account
	 * @return the account number (String). Something like this for example: "ACTN0000123"
	 *         
	 */
	public String getAccountNumber();


	/**
	 * Update the account number of this bank account
	 * @param the account number (String). Something like this for example: "ACTN0000123"
	 *         
	 */
	public void setAccountNumber(String acctN);


	/**
	 * Returns the first name of this bank account's owner
	 * @return the first name (String). Something like: "Joe" or "Jane"
	 *         
	 */
	public String getFirstName();


	/**
	 * Returns the last name of this bank account's owner
	 * @return the last name (String). Something like: "Smith" or "Lopez"
	 *         
	 */
	public String getLastName();

	
	/**
	 * Updates this bank account's owner's first name
	 * @param the first name of the account's owner
	 *         
	 */
	public void setFirstName(String firstN);


	/**
	 * Updates this bank account's owner's last name
	 * @param the last name of the account's owner
	 *         
	 */
	public void setLastName(String lastN);


	/**
	 * Returns the balance of this bank account
	 * @return the balance (double). Something like: 1234.50 
	 *         
	 */
	public double getBalance();


	/**
	 * Updates this bank account's balance
	 * @param the new balance of this account
	 *         
	 */
	public void setBalance(double balance);


	/**
	 * Prints the values of all the items in this account (AccountN, FName, LName, Balance)
	 * Like this:
	 * Account Info: Joe Smith, Acount# ACTN0000123, Balance: $15034.45
	 */
	public void printAccountInfo();

}
