package edu.sbcc.cs105;

import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureStats ts = new TemperatureStats();

        /**
         * Takes user input to determine how many elements will be added to the array list
         */
        System.out.println("Input the number of temperatures you would like to add: ");
        int tempAmmount = sc.nextInt();
        
        /**
         * Prompts user for a number of temperature inputs (loop iterations based on value of tempAmmount)
         */
        for (int i = 0; i < tempAmmount; i++) {
            System.out.printf("Input temperature %d: ", i + 1);
            ts.addTemperature(sc.nextDouble());
        }

        System.out.printf("Maximum temperature is: %.1f\n", ts.getMaximumTemperature());

        System.out.printf("Minium temperature is: %.1f\n", ts.getMinimumTemperature());

        System.out.printf("Average of all temeratures is: %.1f\n", ts.getAverageTemperature());

        ts.clearTemperatures();
        sc.close();
    }
}
