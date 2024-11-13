/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise 17
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Dog myDog = new Dog();

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        System.out.print("Enter a pet name:");
        petName = scnr.next();
        System.out.print("Enter a pet age:");
        petAge = scnr.nextInt();
        System.out.print("Enter a dog name:");
        dogName = scnr.next();
        System.out.print("Enter a dog age:");
        dogAge = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter a dog breed:");
        dogBreed = scnr.nextLine();

        // Set info for first pet
        myPet.setName(petName);
        myPet.setAge(petAge);
        myPet.printInfo();

        // Set info for second pet (Dog)
        myDog.setName(dogName);
        myDog.setAge(dogAge);
        myDog.setBreed(dogBreed);
        myDog.printInfo();
        System.out.println(myDog.getBreed());

        scnr.close();
    }
}
