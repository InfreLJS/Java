package november;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Windows\\system.ini");

			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류.");
		}

	}

}
