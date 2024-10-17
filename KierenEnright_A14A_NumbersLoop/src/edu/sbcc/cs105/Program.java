package edu.sbcc.cs105;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        NumbersLoop nl = new NumbersLoop();
        Scanner sc = new Scanner(System.in);

        System.out.println("Set lower limit: ");
        nl.setLowerLimit(sc.nextInt());

        System.out.println("Set upper limit: ");
        nl.setUpperLimit(sc.nextInt());

        System.out.printf("Sum is: %d", nl.addLowerAllTheWayToUpper());

        sc.close();
    }
}
