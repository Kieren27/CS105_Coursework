/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise23
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        BankAccount acc4 = new BankAccount();
        BankAccount acc5 = new BankAccount();

        //#region User Input Account
        /**
         * This is where the user will input information in the process of creating their account.
         * The user will be prompted four times for their (First Name, Last Name, Account #, Balance)
         */
        System.out.println("\nAccount 1 Initializing...");
        System.out.println("\nEnter your first name: ");
        acc.setFirstName(sc.nextLine());
        System.out.println("\nEnter your last name: ");
        acc.setLastName(sc.nextLine());
        System.out.println("\nPlease enter an account number (ex: ACTN6020456): ");
        acc.setAccountNumber(sc.nextLine());
        System.out.println("\nSet your account's balance: ");
        acc.setBalance(sc.nextDouble());
        System.out.println("Account 1 Created.\n");
        //#endregion

        //#region Test Accounts
        /**
         * These are some premade accounts that do not require
         * any user input. These exist solely to be compared to 
         * the account created via user input.
         */
        System.out.println("Account 2 Initializing...");
        acc2.setFirstName("Ranger");
        acc2.setLastName("Enright");
        acc2.setAccountNumber("ACTN6020123");
        acc2.setBalance(500000.00);
        System.out.println("Account 2 Created.");

        System.out.println("Account 3 Initializing...");
        acc3.setFirstName("Mayzie");
        acc3.setLastName("Enright");
        acc3.setAccountNumber("ACTN0001212");
        acc3.setBalance(20000.00);
        System.out.println("Account 3 Created.");

        System.out.println("Account 4 Initializing...");
        acc4.setFirstName("Max");
        acc4.setLastName("Enright");
        acc4.setAccountNumber("ACTN0000112");
        acc4.setBalance(4000.00);
        System.out.println("Account 4 Created.");

        System.out.println("Account 5 Initializing...");
        acc5.setFirstName("Joe");
        acc5.setLastName("Enright");
        acc5.setAccountNumber("ACTN0000678");
        acc5.setBalance(500.00);
        System.out.println("Account 5 Created.");
        ////#endregion

        /**
         * Compares user generated account to account 2.
         * Was confused on what else to do implementing this as
         * there wasn't much info about what to use it for on Canvas
         */
        acc.compareTo(acc2);
        acc.compareTo(acc5);

        /**
         * Only prints the user's account info.
         * Can repeat this line with additional bank accounts if you'd like those displayed as well
         *  
         */
        acc.printAccountInfo();

        sc.close();
    }
}
