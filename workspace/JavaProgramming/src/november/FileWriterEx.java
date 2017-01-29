package november;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);

		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("/Users/LeeJaeseok/Documents/Programming/Java/Files/htest.txt", false);
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
			System.out.println("끝");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
