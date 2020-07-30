import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.print("������ ���� �̸��� �Է��ϼ���. >> ");
		String fileName = sc.nextLine();

		final String FILEDIRECTORY = "D:\\Google ����̺�\\DSM\\FirstGrade\\Programming\\Java\\Files\\" + fileName + ".txt";
		int[] arr = new int[20];
		int c;
		BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILEDIRECTORY),"utf-8"));

		for (int a = 1; a <= 5; a++) {
			System.out.print(a + "�� : ");
			pw.write(a + "�� : ");
			for (int b = 0; b < 4; b++) {
				while (true) {
					c = random.nextInt(20);
					if (arr[c] == 0) {
						arr[c] = 1;
						break;
					}
				}
				System.out.print(c + 1 + " ");
				pw.write(c + 1 + " ");
			}
			System.out.println();
			pw.newLine();
		}
		
		sc.close();
		pw.close();
	}

}