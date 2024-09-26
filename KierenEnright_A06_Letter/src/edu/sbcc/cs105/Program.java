package edu.sbcc.cs105;

/**
 * This class tests the Letter object.
 *
 */
public class Program {

	/**
	 * Test this code by creating a letter in the form shown in the problem
	 * description.
	 * 
	 * @param args command line values. Not used in this example.
	 */
	public static void main(String[] args) {
		Letter letter = new Letter("Another Person", "Person");

		letter.addLine("I am sorry we must part.");
		letter.addLine("I wish you all the best.");

		System.out.println(letter.getText());
	}
}