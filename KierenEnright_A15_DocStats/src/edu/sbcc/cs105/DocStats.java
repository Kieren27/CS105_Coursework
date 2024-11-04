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

    public int getNumberOfWords() {
        // TODO return total number of words in the file

        int num = 0;
        return num;
    }

    public int getNumberOfLines() {
        // TODO return total number of lines in the file (hint: you can use .size() of
        // the ArrayList)
        
        return fileLines.size();
    }
}
