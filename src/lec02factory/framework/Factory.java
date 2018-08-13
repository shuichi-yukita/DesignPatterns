package lec02factory.framework;

public interface Factory {
	abstract Product createProduct(String owner);
	abstract void registerProduct(Product product);
	public default Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
}
