package lec04abstractFactory.tablefactory;

import lec04abstractFactory.factory.Link;

public class TableLink extends Link {
	public TableLink(String caption, String url) {
		super(caption, url);
	}
	@Override
	public String makeHTML() {
		// TODO 自動生成されたメソッド・スタブ
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}

}
