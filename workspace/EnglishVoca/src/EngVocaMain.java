import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : EngVocaMain.java
 *
 * @Author : 10118���缮
 * @Date : 2016. 9. 1.
 * @Version :
 */

public class EngVocaMain {
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		System.out.print("�ܾ� ��¥�� �Է��ϼ���. >> ");
		int wordDay = sc.nextInt();

		final String FILEDIRECTORY = "E:\\DSM\\FirstGrade\\Programming\\Java\\Files\\" + wordDay + ".txt";
		BufferedReader br = new BufferedReader(new FileReader(FILEDIRECTORY));
		EngVocaMain engvocamain = new EngVocaMain();
		String[] vocaArr = new String[30];
		engvocamain.load(vocaArr, br);

		while (true) {
			System.out.println("�ѿ����� : 1");
			System.out.println("���ѽ��� : 2");
			System.out.println("�ܾ�� : 3");
			System.out.print("�Է� >> ");
			int choose = sc.nextInt();
			sc.nextLine();

			if (choose == 1)
				engvocamain.engTest(vocaArr);
			else if (choose == 2)
				engvocamain.korTest(vocaArr);
			else if (choose == 3)
				engvocamain.showWords(vocaArr);
		}
	}

	public void load(String[] vocaArr, BufferedReader br) throws IOException {
		for (int i = 0; i < 30; i++) {
			vocaArr[i] = br.readLine();
			if (vocaArr[i] == null) {
				vocaArr[i] = "����_�ܾ���� ����_�ܾ����";
			}
		}
	}

	public void korTest(String[] vocaArr) {
		Random random = new Random();
		sc = new Scanner(System.in);

		int checkIndex = random.nextInt(30), numberOfAnswer = 0;
		int[] check = new int[vocaArr.length];
		boolean right = false;

		while (true) {
			if (numberOfAnswer == 30) {
				System.out.println("��� ������ �����̽��ϴ�. �����մϴ�.");
				break;
			}
			while (check[checkIndex] == 1) {
				checkIndex = random.nextInt(30);
			}
			while (true) {
				System.out.print(vocaArr[checkIndex].split(" ")[0] + "�� ����? >> ");
				String ans = sc.next();
				for (int i = 0; i < vocaArr[checkIndex].split(" ")[1].split(",").length; i++) {
					if (ans.equals(vocaArr[checkIndex].split(" ")[1].split(",")[i])) {
						right = true;
						break;
					} else {
						right = false;
					}
				}

				if (right) {
					numberOfAnswer += 1;
					System.out.println("�����Դϴ�! ���� ���� ���� �� : " + numberOfAnswer + " / 30");
					check[checkIndex] = 1;
					break;
				} else {
					System.out.println("�����Դϴ�! ���� ���� ���� �� : " + numberOfAnswer + " / 30");
				}
			}
		}
	}

	public void engTest(String[] vocaArr) {
		Random random = new Random();
		sc = new Scanner(System.in);

		int checkIndex = random.nextInt(30), numberOfAnswer = 0;
		int[] check = new int[vocaArr.length];

		while (true) {
			if (numberOfAnswer == 30) {
				System.out.println("��� ������ �����̽��ϴ�. �����մϴ�.");
				break;
			}
			while (check[checkIndex] == 1) {
				checkIndex = random.nextInt(30);
			}
			while (true) {
				System.out.print(vocaArr[checkIndex].split(" ")[1] + "�� ����? >> ");
				String ans = sc.next();
				if (ans.equals(vocaArr[checkIndex].split(" ")[0])) {
					numberOfAnswer += 1;
					System.out.println("�����Դϴ�! ���� ���� ���� �� : " + numberOfAnswer + " / 30");
					check[checkIndex] = 1;
					break;
				} else {
					System.out.println("�����Դϴ�! ���� ���� ���� �� : " + numberOfAnswer + " / 30");
				}
			}
		}
	}

	public void showWords(String[] vocaArr) {
		sc = new Scanner(System.in);

		int i = 0;
		String str = "n";

		System.out.println("n : ���� �ܾ�");
		System.out.println("p : ���� �ܾ�");
		System.out.println("exit : ������");

		while (true) {
			if ("n".equals(str)) {
				i = (i + 1) % vocaArr.length;
			} else if ("p".equals(str)) {
				i = (i + 29) % vocaArr.length;
			} else if ("exit".equals(str)) {
				System.out.println("ó�� ȭ������ �̵�.");
				return;
			}

			System.out.print(vocaArr[i].split(" ")[0] + " ");
			System.out.println(vocaArr[i].split(" ")[1]);
			str = sc.nextLine();
		}
	}
}