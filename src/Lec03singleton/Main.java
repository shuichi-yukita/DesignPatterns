package Lec03singleton;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンスです。");
		}else {
			System.out.println("obj1とobj2は異なるインスタンスです。");
		}
		System.out.println("End.");
	}
}
