package item;

import visitor.ShoppingCartVisitor;

public interface Item {
	public double accept(ShoppingCartVisitor visitor);
}