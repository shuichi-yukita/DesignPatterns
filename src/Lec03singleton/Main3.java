package Lec03singleton;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Start.");
		Thread a1 = new Thread(new Agent("White"));
		Thread a2 = new Thread(new Agent("Green"));
		Thread a3 = new Thread(new Agent("Black"));
		a1.start();
		a2.start();
		a3.start();
		try {
			a1.join();
			a2.join();
			a3.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("End.");
	}

}

class Agent implements Runnable{
	String name;
	Agent(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0; i<100; i++) {
			int num = TicketMaker.getInstance().getNextTickcetNumber();
			System.out.println(name + ": " + num);
		}
	}
}
