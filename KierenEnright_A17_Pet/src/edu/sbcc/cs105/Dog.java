package edu.sbcc.cs105;

public class Dog {
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
