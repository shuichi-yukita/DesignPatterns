package lec04abstractFactory.tablefactory;

import java.util.Iterator;

import lec04abstractFactory.factory.Item;
import lec04abstractFactory.factory.Page;

public class TablePage extends Page {
	public TablePage(String title, String author) {
		super(title, author);
	}
	@Override
	public String makeHTML() {
		// TODO 自動生成されたメソッド・スタブ
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>\n<head>\n<title>" + title + "</title>\n</head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator it = content.iterator();
		while(it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append("<tr>" + item.makeHTML() + "</tr>");
		}
		buffer.append("</body>\n</html>\n");
		return buffer.toString();
	}
}
