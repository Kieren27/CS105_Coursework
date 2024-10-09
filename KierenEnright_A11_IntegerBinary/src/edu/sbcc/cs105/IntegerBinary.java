package edu.sbcc.cs105;

public class IntegerBinary {

    private String userInput;

    public void setInputString(String str) {
        this.userInput = str;
    }

    public boolean isBinary() {
        if (userInput == null || userInput.isEmpty()) {
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