/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Exercise22
 * @author Kieren Enright
 */
package edu.sbcc.cs105;

/**
 * This file was provided as boilerplate for this project on canvas.
 * More lines can be added to either remove or add more items to Inventory.
 */
public class Program {

	public static void main(String[] args) {

		Inventory inv = new Inventory();
		GenericItem genericItem1 = new GenericItem();
		GenericItem genericItem2 = new GenericItem();
		GenericItem genericItem3 = new GenericItem();
		BakeryItem bakeryItem1 = new BakeryItem();
		BakeryItem bakeryItem2 = new BakeryItem();
		ProduceItem produceItem1 = new ProduceItem();
		ProduceItem produceItem2 = new ProduceItem();

		genericItem1.setName("Smith Cereal");
		genericItem1.setQuantity(300);
		genericItem2.setName("Clorox Bleach");
		genericItem2.setQuantity(150);
		genericItem3.setName("Bounty Paper Towel");
		genericItem3.setQuantity(100);

		bakeryItem1.setName("Apple Pie");
		bakeryItem1.setQuantity(20);
		bakeryItem1.setExpiration("May 5, 2021");
		bakeryItem1.addIngredient("Apples");
		bakeryItem1.addIngredient("Sugar");
		bakeryItem1.addIngredient("Butter");
		bakeryItem1.addIngredient("Eggs");
		bakeryItem1.addIngredient("Flour");
		bakeryItem1.addIngredient("Pie Crust");
		bakeryItem1.addIngredient("Cinnamon");

		bakeryItem2.setName("Napolean Cake");
		bakeryItem2.setQuantity(25);
		bakeryItem2.setExpiration("April 20, 2021");
		bakeryItem1.addIngredient("Flour");
		bakeryItem2.addIngredient("Salt");
		bakeryItem2.addIngredient("White Vinegar");
		bakeryItem2.addIngredient("eggs");
		bakeryItem2.addIngredient("Butter");
		bakeryItem2.addIngredient("Vanilla Extract");
		bakeryItem2.addIngredient("Milk");

		produceItem1 = new ProduceItem();
		produceItem1.setName("Apple");
		produceItem1.setQuantity(40);
		produceItem1.setVendor("Stemilt Farms");
		produceItem1.setExpiration("May 5, 2012");

		produceItem2 = new ProduceItem();
		produceItem2.setName("Peach");
		produceItem2.setQuantity(60);
		produceItem2.setVendor("Fitzgerald Fruit Farms");
		produceItem2.setExpiration("June 12, 2021");

		inv.addItemToInventory(genericItem1);
		inv.addItemToInventory(genericItem2);
		inv.addItemToInventory(genericItem3);
		inv.addItemToInventory(bakeryItem1);
		inv.addItemToInventory(bakeryItem2);
		inv.addItemToInventory(produceItem1);
		inv.addItemToInventory(produceItem2);

		inv.printInventory();
	}
}