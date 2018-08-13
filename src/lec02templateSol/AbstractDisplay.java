package lec02templateSol;

public interface AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public default void display() {
		open();
		for (int i=0; i<5; i++) {
			print();
		}
		close();
	}
	public default void display(int n) {
		open();
		for (int i=0; i<n; i++) {
			print();
		}
		close();
	}
}
