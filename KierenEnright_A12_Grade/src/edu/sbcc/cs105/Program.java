package edu.sbcc.cs105;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Grade gr = new Grade();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your letter grade (A, B, C, D, F): ");
        String userInput = sc.nextLine();
    
        gr.setGrade(userInput);

        System.out.println("The numeric grade for " + gr.getLetterGrade() + " is " + gr.getNumericGrade());

        sc.close();
    }
}
