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
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo       
      
      // TODO: Create dog pet (using dogName, dogAge, dogBreed) and then call printInfo
      
      // TODO: Use getBreed(), to output the breed of the dog
      
   }
}
