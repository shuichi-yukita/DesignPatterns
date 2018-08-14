package utilities;

public class Utf8 {
	// getWidth calculates the width of a string
	// for the console,
	// where zenkaku characters count for two.
	public static int getWidth(String string) {
		int len=0;
		for (int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			//  (英数字) (\ 記号) (~ 記号) (半角カナ)
			if ((c <= '\u007e') || (c == '\u00a5')
					|| (c == '\u203e') || (c >= '\uff61' && c <= '\uff9f')) {
				len++;
			} else { // その他 (全角)
				len += 2;
			}
		}
		return len;
	}
}
