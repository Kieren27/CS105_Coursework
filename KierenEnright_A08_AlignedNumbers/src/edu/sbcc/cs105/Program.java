package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the AlignedNumbers object.
 *
 */
public class Program {

	/**
	 * Test this code by asking for two numbers, computing the various stats, and
	 * then printing it out.
	 * 
	 * @param args command line values. Not used in this example.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AlignedNumbers stats = new AlignedNumbers();

		System.out.println("Input first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Input second number: ");
		int secondNumber = input.nextInt();

		stats.setFirstNumber(firstNumber);
		stats.setSecondNumber(secondNumber);

		stats.printStats();

		input.close();
	}
}