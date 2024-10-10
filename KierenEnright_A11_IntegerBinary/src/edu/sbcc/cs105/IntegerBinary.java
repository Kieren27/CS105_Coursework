package edu.sbcc.cs105;

public class IntegerBinary {

    private String userInput;
/**
 * Sets userInput instance variable to value of str
 * 
 * @param str
 */
    public void setInputString(String str) {
        this.userInput = str;
    }
/**
 * 
 * @return false if userInput is either empty or characters within string do not equal "0" or "1"
 */
    public boolean isBinary() {
        if (userInput == null || userInput.isEmpty()) {
            System.out.println("Nothing was entered.");
            return false;
        }

        String[] tokens = userInput.split(" ");
        for (String token : tokens) {
            if (!token.equals("0") && !token.equals("1")) {
                return false;
            }
        }
        return true;
    }
}