package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the GaussianEaster object.
 *
 */
public class Program {

    /**
     * Test this code by asking for a year and then having the GaussianEaster class compute the value.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Easter Year: ");
        int y = sc.nextInt();

        GaussianEaster ge = new GaussianEaster(y);
       
        System.out.println("Year: " + y + " Month: " + ge.getM() + " Day: " + ge.getD());
        sc.close();
    }
}