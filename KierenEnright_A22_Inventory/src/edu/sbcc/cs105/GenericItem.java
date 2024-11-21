/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise22
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

public class GenericItem {

    protected String name; // name variable used for all items and all sub-classes
    protected int qty; // quantity variable used for all items and all sub-classes
    protected String date; // date variable used for all items and all sub-classes

    /**
     * Sets name for item
     * 
     * @param newName
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Sets the quantity of an item
     * 
     * @param newQty
     */
    public void setQuantity(int newQty) {
        this.qty = newQty;
    }

    /**
     * Set the expiration date of an item
     * 
     * @param newDate
     */
    public void setExpiration(String newDate) {
        this.date = newDate;
    }

    /**
     * @return the previously set expiration date as seen above
     */
    public String getExpiration() {
        return date;
    }

    public void printItem() {
        System.out.printf("Item Name: %s - Quantity: %d\n", name, qty);
    }
}
