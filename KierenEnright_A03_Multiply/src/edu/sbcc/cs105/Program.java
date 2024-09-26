package edu.sbcc.cs105;

public class Program {

	/**
	 * This method creates a Multiply object and then uses it to multiply 2 by 3. It
	 * prints out this result along with the expected result for error checking.
	 */
	public static void main(String[] args) {
		Multiply multiply = new Multiply();

		int shouldBeSix = multiply.byTwo(3);

		System.out.println("If you double 3 you should get 6 and we get " + shouldBeSix + ".");

		int shouldBeEight = multiply.getProduct(2, 4);
		System.out.println("The Product of 2 x 4 is " + shouldBeEight + ".");
	}

}