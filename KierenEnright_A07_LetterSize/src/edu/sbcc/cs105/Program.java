package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class Program {

	public static void main(String[] args) {

		LetterSize size = new LetterSize(8.5, 11);
		// TODO Test the LetterSize class by creating an 8.5 x 11 inch
		// letter and getting the size in millimeters.
		System.out.printf("Width in millimeters: " + "%.4f", size.getWidthInMillimeters());
		System.out.printf("\nHeight in millimeters: " + "%.4f", size.getHeightInMillimeters());
	}
}