/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise 17
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

/**
 * This is a sublass of the Pet class, and therefore uses the same methods to set
 * its info with the addtion of being able to set the dog's breed.
 */
public class Dog extends Pet {
    private String dogBreed;

    /**
     * 
     * @param userBreed takes user input to assign to instance variable (dogBreed)
     */
    public void setBreed(String userBreed) {
        this.dogBreed = userBreed;
    }

    /**
     * 
     * @return previouly assigned dogBreed
     */
    public String getBreed() {
        return ("   Breed: " + dogBreed);
    }
}
