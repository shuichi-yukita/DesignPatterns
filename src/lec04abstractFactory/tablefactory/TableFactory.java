package lec04abstractFactory.tablefactory;

import lec04abstractFactory.factory.Factory;
import lec04abstractFactory.factory.Link;
import lec04abstractFactory.factory.Page;
import lec04abstractFactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		// TODO 自動生成されたメソッド・スタブ
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO 自動生成されたメソッド・スタブ
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO 自動生成されたメソッド・スタブ
		return new TablePage(title, author);
	}

}
