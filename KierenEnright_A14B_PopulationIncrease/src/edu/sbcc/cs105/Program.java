package edu.sbcc.cs105;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Population pop = new Population();
        Scanner sc = new Scanner(System.in);

        System.out.println("Set initial population: ");
        pop.setPopulation(sc.nextInt());

        System.out.println("Set target population: ");
        pop.setTargetPopulation(sc.nextInt());

        System.out.printf("Current population is: %d\n", pop.getPopulation());
        
        System.out.println("Enter the anual rate of population increase (percentage): ");
        
        System.out.printf("It will take %d years to reach the target population of %d.\n", pop.getNumberOfYearsToReachThisPopulation(sc.nextInt(), pop.getPopulation()), pop.getTargetPopulation());

        sc.close();
    }
}
