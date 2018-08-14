package lec03prototype;

import lec03prototype.framework.Product;
import utilities.Utf8;

public class UnderlinePen implements Product {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	@Override
	public void use(String s) {
		// TODO 自動生成されたメソッド・スタブ
//		int length = s.getBytes().length;
		int length = Utf8.getWidth(s);
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i=0; i<length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		// TODO 自動生成されたメソッド・スタブ
		Product p = null;
		try {
			p = (Product)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
