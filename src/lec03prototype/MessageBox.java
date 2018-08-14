package lec03prototype;

import lec03prototype.framework.Product;
import utilities.Utf8;

public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	@Override
	public void use(String s) {
		// TODO 自動生成されたメソッド・スタブ
//		int length = s.getBytes().length;
		int length = Utf8.getWidth(s);
		for(int i = 0; i<length+4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar+" "+ s + " " + decochar);
		for(int i = 0; i<length+4; i++) {
			System.out.print(decochar);
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
