package Lec03singleton;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Start.");
		for(int i = 0; i < 10; i++) {
			System.out.println(i+":" + TicketMaker.getInstance().getNextTickcetNumber());
		}
		System.out.println("End.");
	}

}
