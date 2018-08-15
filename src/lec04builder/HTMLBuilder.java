package lec04builder;

public class HTMLBuilder implements Builder {
	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("<html>\n<head>\n<title>" + title + "</title>\n</head>\n<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
	}

	@Override
	public void makeString(String str) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("<p>" + str + "</p>\n");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("<ul>\n");
		for(String item: items) {
			buffer.append("<li>" + item + "</li>\n");
		}
		buffer.append("</ul>\n");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("</body>\n</html>\n");
	}

	@Override
	public String getResult() {
		// TODO 自動生成されたメソッド・スタブ
		return buffer.toString();
	}

}
