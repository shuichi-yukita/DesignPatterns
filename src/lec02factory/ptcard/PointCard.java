package lec02factory.ptcard;

import lec02factory.framework.Product;

public class PointCard implements Product {
	private String owner;
	private int points;
	PointCard(String owner){
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
		points = 0;
	}
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		points += 10;
		System.out.println(owner + "のカードに10pt加算します。");
		System.out.println("現在のポイントは"+ points);
	}
	public String getOwner() {
		return owner;
	}
}
