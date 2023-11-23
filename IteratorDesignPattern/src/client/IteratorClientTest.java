package client;

import collection.Collection;
import collection.impl.CollectionImpl;
import iterator.Iterator;

public class IteratorClientTest {

	public static void main(String[] args) {
		
		//Create an Instance of Collection
		Collection collection = new CollectionImpl();
		
		//Getting instance of Collection out of collection
		Iterator iterator = collection.getIterator();
		
		/*Now Visit every element of collection
		  and print it's value using iterator*/
		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name =(String)object;
			System.out.println("Name::"+name);
		}
	}
}