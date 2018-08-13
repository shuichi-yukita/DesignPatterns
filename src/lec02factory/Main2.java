package lec02factory;

import lec02factory.framework.Factory;
import lec02factory.framework.Product;
import lec02factory.idcard.IDCardFactory;
import lec02factory.ptcard.PointCardFactory;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		Factory factory1 = new IDCardFactory();
		Factory factory2 = new PointCardFactory();
		Product card1 = factory1.create("結城浩");
		Product card2 = factory2.create("とむら");
		Product card3 = factory2.create("佐藤花子");
		card1.use();
		card2.use();
		card3.use();
		card2.use();
	}
}
