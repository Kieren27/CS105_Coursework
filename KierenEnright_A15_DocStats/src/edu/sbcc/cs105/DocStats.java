package edu.sbcc.cs105;

import java.io.*;
import java.util.*;

public class DocStats {

    private ArrayList<String> fileLines = new ArrayList<>();

    public DocStats(String filename) throws FileNotFoundException {

        fileLines.clear();
        File txtFile = new File(filename); // could throw exception
        Scanner fileScanner = new Scanner(txtFile);

        while (fileScanner.hasNextLine()) // similar to System.in
        {
            String nextLine = fileScanner.nextLine();
            fileLines.add(nextLine); // add each line of the file to the ArrayList fileLines.
        }
        fileScanner.close();
    }

    /**
     * Loops through each line formatting / counting each string and ignores
     * whitespace. 
     * 
     * @return totalWords
     */
    public int getNumberOfWords() {
        int totalWords = 0;

        for (String fileWord : fileLines) {
            totalWords += fileWord.trim().split("\\s+").length;
        }

        return totalWords;
    }

    /**
     * 
     * @return fileLines.size()
     */
    public int getNumberOfLines() {
        return fileLines.size();
    }
}
