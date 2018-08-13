package lec02templateSol;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		AbstractDisplay d3 = new StringDisplay("こんにちは。");
		d1.display(10);
		d2.display(3);
		d3.display(7);
	}
}
