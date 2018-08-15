package lec04abstractFactory.listfactory;

import lec04abstractFactory.factory.Link;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption,url);
	}

	@Override
	public String makeHTML() {
		// TODO 自動生成されたメソッド・スタブ
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
