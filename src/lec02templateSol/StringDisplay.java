package lec02templateSol;

public class StringDisplay implements AbstractDisplay {
	private String string;
	private int width;
	public StringDisplay(String string) {
		this.string = string;
//		this.width = string.getBytes().length;
		this.width = getWidth(string);
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
	private int getWidth(String string) {
		int len=0;
		for (int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			//  (英数字) (\ 記号) (~ 記号) (半角カナ)
			if ((c <= '\u007e') || (c == '\u00a5')
					|| (c == '\u203e') || (c >= '\uff61' && c <= '\uff9f')) {
				len++;
			} else { // その他 (全角)
				len += 2;
			}
		}
		return len;
	}
}
