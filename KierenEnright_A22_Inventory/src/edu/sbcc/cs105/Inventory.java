/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise22
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * This class is responsible for storing and displaying every item.
 */
public class Inventory {
    protected ArrayList<GenericItem> Inventory = new ArrayList<>(); // Constucts (Inventory) ArrayList to store created items

    /**
     * Adds specified item to (Inventory) ArrayList
     * 
     * @param item
     */
    public void addItemToInventory(GenericItem item) {
        Inventory.add(item);
    }

    /**
     * Removes specified item from the (Inventory) ArrayList
     * 
     * @param item
     */
    public void removeItemFromInventory(GenericItem item) {
        Inventory.remove(item);
    }

    /**
     * Prints every item stored within the (Inventory) ArrayList.
     * More details on how specific item type are printed can be found in the comments below.
     */
    public void printInventory() {
        System.out.println("**************************************************************************");
        System.out.println("Inventory: ");
        System.out.println("**************************************************************************");

        /**
         * Checks if each item (element in Inventory ArrayList) is an instance of the BakeryItem class.
         * If true, the item is printed.
         * If false, an error message will be printed instead.
         */
        System.out.println("\n--------- Bakery Items ---------");
        boolean isBakeryItem = false;
        for (GenericItem item : Inventory) {
            if (item instanceof BakeryItem) {
                isBakeryItem = true;
                ((BakeryItem) item).printItem();
            }
        }
        if (!isBakeryItem) {
            System.out.println("There are no bakery items.");
        }

        /**
         * Also checks if each item (element in Inventory ArrayList) is an instance of the ProduceItem class.
         * If true, the item is printed.
         * If false, an error message will be printed instead.
         */
        System.out.println("\n--------- Produce Items ---------");
        boolean isProduceItem = false;
        for (GenericItem item : Inventory) {
            if (item instanceof ProduceItem) {
                isProduceItem = true;
                ((ProduceItem) item).printItem();
            }
        }
        if (!isProduceItem) {
            System.out.println("There are no produce items.");
        }

        /**
         * Checks if each item within the (Inventory) ArrayList is NOT an instance of BakeryItem or ProduceItem.
         * If item is not an insance of the aforementioned classes, it gets printed.
         */
        System.out.println("\n--------- Generic Items ---------");
        for (GenericItem item : Inventory) {
            if (!(item instanceof BakeryItem) && !(item instanceof ProduceItem)) {
                ((GenericItem) item).printItem();
            }
        }

        System.out.println("\n**************************************************************************");
    }
}
