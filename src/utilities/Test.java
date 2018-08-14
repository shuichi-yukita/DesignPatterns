package utilities;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("Hello -> ");
		System.out.println(Utf8.getWidth("Hello"));
		System.out.print("今日は -> ");
		System.out.println(Utf8.getWidth("今日は"));
		System.out.print("Hello今日は -> ");
		System.out.println(Utf8.getWidth("Hello今日は"));
	}
}
