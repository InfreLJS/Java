package november;

import java.io.IOException;

public class ReadFromSysEx {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
			System.out.write(b, 0, len);
		} catch (IOException ee) {
			System.out.println("입력 실패.");
		}
	}

}
