package p364;

import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {

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
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}

}
