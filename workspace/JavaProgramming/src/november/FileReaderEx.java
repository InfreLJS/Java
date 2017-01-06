package november;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

	public static void main(String[] args) {
		String[] filenames = { "/Users/LeeJaeseok/Documents/Programming/Java/Files/hangul.txt",
				"/Users/LeeJaeseok/Documents/Programming/Java/Files/system.ini" };
		for (int i = 0; i < filenames.length; i++) {
			FileInputStream fin = null;
			InputStreamReader in = null;
			try {
				System.out.println("--------------------");
				fin = new FileInputStream(filenames[i]);
				in = new InputStreamReader(fin, "UTF-8");

				int c;
				while ((c = in.read()) != -1) {
					System.out.print((char) c);
				}
				in.close();
			} catch (IOException e) {
				System.out.println("����� ����[" + i + "]");
			}
		}
	}

}
