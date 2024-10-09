package edu.sbcc.cs105;

import java.util.*;
public class Program {

    public static void main(String[] args) {
        // TDDO: test the IntegerBinary object here
        Scanner sc = new Scanner(System.in);
        IntegerBinary bi = new IntegerBinary();

        System.out.println("Please enter a binary number: ");
        String input = sc.nextLine();

        bi.setInputString(input);

        if (bi.isBinary()) {
            System.out.println(input + " is a valid binary number.");
        } else {
            System.out.println(input + " is a valid binary number.");
        }

        sc.close();
    }

}