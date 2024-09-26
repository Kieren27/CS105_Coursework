package edu.sbcc.cs105;

public class Program {

	/**
	 * This method creates a DieSimulator object and repeatedly invokes its
	 * rollTheDie method. The hope is that there are enough calls here to show that
	 * the simulator works properly.
	 */
	public static void main(String[] args) {
		DieSimulator ds = new DieSimulator();

//		System.out.println("One die roll is " + ds.rollTheDie());
//		System.out.println("A second die roll is " + ds.rollTheDie());
//		// TODO: Add more of these until you are convinced the code works
//		// correctly.
//		System.out.println("Another die roll is " + ds.rollTheDie());

		// This for loop will call the ds.rollTheDie() function 6 times while printing
		// the random number that is returned each time
		for (int i = 0; i < 6; i++) {
			System.out.println("The die roll is " + ds.rollTheDie());
		}
	}
}