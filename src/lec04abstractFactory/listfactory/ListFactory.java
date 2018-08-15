package lec04abstractFactory.listfactory;

import lec04abstractFactory.factory.Factory;
import lec04abstractFactory.factory.Link;
import lec04abstractFactory.factory.Page;
import lec04abstractFactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		// TODO 自動生成されたメソッド・スタブ
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO 自動生成されたメソッド・スタブ
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO 自動生成されたメソッド・スタブ
		return new ListPage(title, author);
	}

}
