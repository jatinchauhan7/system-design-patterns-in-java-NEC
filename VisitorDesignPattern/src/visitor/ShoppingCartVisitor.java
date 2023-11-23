package visitor;

import item.impl.Book;
import item.impl.Fruit;

public interface ShoppingCartVisitor {

	public double visit(Book book);
	public double visit(Fruit fruit);
}