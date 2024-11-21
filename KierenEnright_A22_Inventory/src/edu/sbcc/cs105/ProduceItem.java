/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise22
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

/**
 * This class inherits from GenericItem to store Produce Items
 */
public class ProduceItem extends GenericItem {
    private String vendor; // Instance variable for ProduceItem class

    /**
     * Sets instance variable (vendor)
     * 
     * @param v
     */
    public void setVendor(String v) {
        this.vendor = v;
    }

    /**
     * 
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void printItem() {
        System.out.printf("Item Name: %s - Quantity: %d - (Vendor: %s)\n", name, qty, vendor);
    }
}
