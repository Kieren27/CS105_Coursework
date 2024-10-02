package edu.sbcc.cs105;

public class IntegerSign {
	private int storedNumber;
/**
 * 
 * @param numberToStore assign instance var "storedNumber" with value of "numberToStore"
 */
	public IntegerSign(int numberToStore) {
		this.storedNumber = numberToStore;
	}
/**
 * 
 * @return true if "storedNumber" is equal to zero
 */
	public boolean isZero() {
		if (storedNumber == 0) {
			return true;
		} else {
			return false;
		}
	}
/**
 * 
 * @return true if "storedNumber" is positive
 */
	public boolean isPositive() {
		if (storedNumber >= 0) {
			return true;
		} else {
			return false;
		}
	}
}