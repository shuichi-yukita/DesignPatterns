package lec01adapterDel;

public class PrintBanner extends Print {
	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		// TODO 自動生成されたメソッド・スタブ
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO 自動生成されたメソッド・スタブ
		banner.showWithAster();
	}
}
