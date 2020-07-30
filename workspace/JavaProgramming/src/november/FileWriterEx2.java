package november;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx2 {
	static String filename = "/Users/LeeJaeseok/Documents/Programming/Java/Files/htest.txt";

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);

		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter(filename);
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
			System.out.println("끝");

			FileInputStream fis = null;
			fis = new FileInputStream(filename);

			while ((c = fis.read()) != -1) {
				System.out.println(c + " ");
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
