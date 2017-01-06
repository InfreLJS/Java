package november;

import java.io.IOException;
import java.io.InputStream;

public class InputEx {
	public static void streamTest(InputStream is) {
		try {
			while (true) {
				int a = is.read();
				if (a == (-1))
					break;
				char c = (char) a;
				System.out.print(c + " ");
			}
		} catch (IOException e) {
			System.out.println();
		}
		System.out.println("³¡");
	}

	public static void main(String[] args) {
		streamTest(System.in);

	}

}
