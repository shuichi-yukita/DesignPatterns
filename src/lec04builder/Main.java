package lec04builder;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if(args.length != 1) {
			usage();
			System.exit(0);
		}

		Builder builder = null;
		if(args[0].equals("plain")) {
			builder = new TextBuilder();
		}else if(args[0].equals("html")) {
			builder = new HTMLBuilder();
		}else {
			usage();
			System.exit(0);
		}

		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getResult());
	}

	private static void usage() {
		System.out.println("Usage: java Main [plain|html]");
	}

}
