package edu.sbcc.cs105;

/**
 * This class simulates rolling a die by generating a random number between 1
 * and 6 inclusive.
 */
public class DieSimulator {

	public int rollTheDie() {
		int randomDieRoll = (int) ((Math.random() * 6) + 1);

		/*
		 * TODO: YOUR CODE GOES HERE Use the Java APi (link provided) to find out how to
		 * return a random integer from 1 to 6 inclusive
		 */

		return randomDieRoll;
	}
}