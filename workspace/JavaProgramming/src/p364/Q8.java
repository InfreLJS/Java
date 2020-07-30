package p364;

import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		InputStreamReader rd = new InputStreamReader(System.in);
		System.out.println("문자를 입력하세요");

		while (true) {
			int c = rd.read();
			if (c == -1)
				break;
			sb.append((char) c);
		}

		String[] strs = sb.toString().split(" ");
		int maxLength = strs[0].length();
		int maxIndex = 0;
		for (int i = 0; i < strs.length; i++) {
			if (maxLength < strs[i].length()) {
				maxLength = strs[i].length();
				maxIndex = i;
			}
		}
		System.out.println("가장 긴 문자열은 " + strs[maxIndex].trim() + " 입니다.");
	}

}
