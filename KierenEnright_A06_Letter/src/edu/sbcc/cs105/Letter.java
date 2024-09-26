package edu.sbcc.cs105;

/**
 * This class creates letters in an automated fashion.
 *
 */
public class Letter {

	/**
	 * Constructor that sets the letter writer and recipient.
	 * 
	 * @param from Person who is writing the letter.
	 * @param to   Person to whom the letter is addressed.
	 */

	private String from;
	private String to;
	private String body;

	public Letter(String from, String to) {
		this.from = from;
		this.to = to;
		this.body = "";
	}

	/**
	 * Add a line of text to the body of the letter.
	 * 
	 * @param line
	 */
	public void addLine(String line) {
		body += line + "\n";
	}

	/**
	 * Creates a letter using the designated sender and recipient. The format of the
	 * letter is:
	 * 
	 * Dear recipient name: blank line first line of the body second line of the
	 * body ... last line of the body blank line Sincerely, blank line sender name
	 * 
	 * @return the formatted letter.
	 */
	public String getText() {
		return "Dear " + to + ":\n\n" + body + "\nSincerely,\n\n" + from;
	}
}