package lec02factory.idcard;

import lec02factory.framework.Product;

public class IDCard implements Product {
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(owner + "のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}
}
