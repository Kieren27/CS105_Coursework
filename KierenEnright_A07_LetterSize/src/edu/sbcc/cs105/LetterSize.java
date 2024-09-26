package edu.sbcc.cs105;

/**
 * This class converts the size of letters.
 *
 */
public class LetterSize {

	private double widthInInches;
	private double heightInInches;
	static final double INCHES_TO_MM = 25.4;

	/**
	 * Assigns instance variables with width and height provided
	 * 
	 * @param widthInInches
	 * @param heightInInches
	 */
	public LetterSize(double widthInInches, double heightInInches) {
		this.widthInInches = widthInInches;
		this.heightInInches = heightInInches;
	}

	/**
	 * Returns the width after converting it to millimeters
	 * 
	 * @return widthInMillimeters
	 */
	public double getWidthInMillimeters() {
		double widthInMillimeters = widthInInches * INCHES_TO_MM;
		return widthInMillimeters;
	}

	/**
	 * Returns the height after converting it to millimeters
	 * 
	 * @return heightInMillimeters
	 */
	public double getHeightInMillimeters() {
		double heightInMillimeters = heightInInches * INCHES_TO_MM;
		return heightInMillimeters;
	}
}