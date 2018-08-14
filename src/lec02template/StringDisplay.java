package lec02template;
import utilities.Utf8;

public class StringDisplay implements AbstractDisplay {
	private String string;
	private int width;
	public StringDisplay(String string) {
		this.string = string;
//		this.width = string.getBytes().length;
		this.width = Utf8.getWidth(string);
	}
	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
	}
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i<width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
