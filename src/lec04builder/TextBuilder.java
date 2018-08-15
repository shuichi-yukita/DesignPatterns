package lec04builder;

public class TextBuilder implements Builder {
	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("============================\n");
		buffer.append("『" + title + "』\n");
		buffer.append("\n");
	}

	@Override
	public void makeString(String str) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append('■' + str + "\n");
		buffer.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO 自動生成されたメソッド・スタブ
		for(String item: items) {
			buffer.append("　・" + item + "\n");
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("============================\n");
	}

	@Override
	public String getResult() {
		// TODO 自動生成されたメソッド・スタブ
		return buffer.toString();
	}
}
