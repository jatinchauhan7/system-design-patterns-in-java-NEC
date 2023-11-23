package client;

import item.Item;
import item.impl.Book;
import item.impl.Fruit;
import visitor.ShoppingCartVisitor;
import visitor.ShoppingCartVisitorImpl;

public class VisitorTest {

	public static void main(String[] args) {

		//Add as much as Items you want
		Item items[] =  new Item[] {
				new Book("Core Java", "8989898", 450.0),
				new Book("Hibernate", "8980998", 700.0),
				new Fruit("Mango", 2, 100.0),
				new Fruit("Apple", 3, 200.0)
			};
		
		//Calculate total cost of all Items
		double totalCost = calculateTotalCost(items);
		
		//Display total cost
		System.out.println("Total Cost ::"+totalCost);
			
	}

	private static double calculateTotalCost(Item[] items) {
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		for (Item item : items) {
			totalCost += item.accept(shoppingCartVisitor);
		}
		return totalCost;
	}


}