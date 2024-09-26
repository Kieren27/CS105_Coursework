package edu.sbcc.cs105;

/**
 * This class computes the statistics of two integers and prints them out.
 *
 */
public class AlignedNumbers {
	private int firstNumber;
	private int secondNumber;
// TODO add other instance variable(s) needed

	// TODO add other methods needed and javadoc comments

	/**
	 * Assigns instance variable with the first value provided by the user
	 * 
	 * @param firstNumber
	 */
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * Assigns instance variable with the second value provided by the user
	 * 
	 * @param secondNumber
	 */
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	/**
	 * Returns the sum of the two values
	 * 
	 * @return sum
	 */
	public int getSum() {
		int sum = firstNumber + secondNumber;
		return sum;
	}

	/**
	 * Returns the average of the two values
	 * 
	 * @return average
	 */
	public double getAverage() {
		double average = (firstNumber + secondNumber) / 2.0;
		return average;
	}

	/**
	 * Returns the difference of the two values.
	 * 
	 * @return difference
	 */
	public int getDifference() {
		int difference = secondNumber - firstNumber;
		return difference;
	}

	/**
	 * Returns the product of the two values
	 * 
	 * @return product
	 */
	public int getProduct() {
		int product = firstNumber * secondNumber;
		return product;
	}

	public void printStats() {
		System.out.printf("Sum: " + "%25s%n", getSum());
		System.out.printf("Average: " + "%24.2f%n", getAverage());
		System.out.printf("Difference: " + "%18s%n", getDifference());
		System.out.printf("Product: " + "%21s%n", getProduct());
	}
}