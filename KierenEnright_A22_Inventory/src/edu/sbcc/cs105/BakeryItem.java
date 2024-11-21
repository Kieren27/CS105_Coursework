/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise22
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * This class inherits from GenericItem to store Bakery Items
 */
public class BakeryItem extends GenericItem {
    private ArrayList<String> ingredients; // Place to store ingredients

    /**
     * Constructor for (ingredients) ArrayList
     */
    public BakeryItem() {
        ingredients = new ArrayList<>();
    }

    /**
     * Adds ingredients passed from main to (ingredients) ArrayList
     * 
     * @param ing
     */
    public void addIngredient(String ing) {
        ingredients.add(ing);
    }

    /**
     * 
     * @return the entire (ingredients) ArrayList
     */
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    /**
     * Prints each ingredient element from the (ingredients) ArrayList
     */
    public void printItem() {
        System.out.printf("\nItem Name: %s - Quantity: %d - Expiration Date: %s", name, qty, date);
        System.out.println("\nIngredients: ");
        for (String ingredient : ingredients) {
            System.out.println("    " + ingredient);
        }
    }
}
