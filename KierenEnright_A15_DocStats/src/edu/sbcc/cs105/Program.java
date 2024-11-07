package edu.sbcc.cs105;

import java.io.FileNotFoundException;

public class Program {
    public static void main(String[] args) {
        try {

            DocStats ds = new DocStats("goblin.txt");
            System.out.printf("File has %d lines\n", ds.getNumberOfLines());
            System.out.printf("File has %d words\n", ds.getNumberOfWords());

        } catch (FileNotFoundException ex) {
            System.out.println("System could not open file.");
        }

    }
}