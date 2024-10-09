package edu.sbcc.cs105;

public class Grade {

    private String userGrade;
    private double numericGrade;
/**
 * 
 * @param grade takes user's input and assigns value to userGrade, forces string to uppercase
 */
    public void setGrade(String grade) {
        this.userGrade = grade;
        userGrade = userGrade.toUpperCase();
    }
/**
 * 
 * @return the letter grade the user entered
 */
    public String getLetterGrade() {
        return userGrade;
    }
/**
 * 
 * @return user's letter grade as a double
 */
    public double getNumericGrade() {
        if (userGrade.equals("A")) {
            numericGrade = 4.0;
        } else if (userGrade.equals("B")) {
            numericGrade = 3.0;
        } else if (userGrade.equals("C")) {
            numericGrade = 2.0;
        } else if (userGrade.equals("D")) {
            numericGrade = 1.0;
        } else if (userGrade.equals("F")) {
            numericGrade = 0.0;
        }
        return numericGrade;
    }
}
