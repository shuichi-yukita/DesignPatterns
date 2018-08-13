package lec02factory.ptcard;

import java.util.ArrayList;
import java.util.List;

import lec02factory.framework.Factory;
import lec02factory.framework.Product;

public class PointCardFactory implements Factory {
	private List owners = new ArrayList();
	@Override
	public Product createProduct(String owner) {
		// TODO 自動生成されたメソッド・スタブ
		return new PointCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		// TODO 自動生成されたメソッド・スタブ
		owners.add(((PointCard)product).getOwner());
	}
	public List getOwners() {
		return owners;
	}
}
