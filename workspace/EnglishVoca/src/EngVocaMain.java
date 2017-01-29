import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : EngVocaMain.java
 *
 * @Author : 10118이재석
 * @Date : 2016. 9. 1.
 * @Version :
 */

public class EngVocaMain {
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		System.out.print("단어 날짜를 입력하세요. >> ");
		int wordDay = sc.nextInt();

		final String FILEDIRECTORY = "E:\\DSM\\FirstGrade\\Programming\\Java\\Files\\" + wordDay + ".txt";
		BufferedReader br = new BufferedReader(new FileReader(FILEDIRECTORY));
		EngVocaMain engvocamain = new EngVocaMain();
		String[] vocaArr = new String[30];
		engvocamain.load(vocaArr, br);

		while (true) {
			System.out.println("한영시험 : 1");
			System.out.println("영한시험 : 2");
			System.out.println("단어보기 : 3");
			System.out.print("입력 >> ");
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
				vocaArr[i] = "오류_단어없음 오류_단어없음";
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
				System.out.println("모든 문제를 맞히셨습니다. 축하합니다.");
				break;
			}
			while (check[checkIndex] == 1) {
				checkIndex = random.nextInt(30);
			}
			while (true) {
				System.out.print(vocaArr[checkIndex].split(" ")[0] + "의 뜻은? >> ");
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
					System.out.println("정답입니다! 현재 맞힌 문제 수 : " + numberOfAnswer + " / 30");
					check[checkIndex] = 1;
					break;
				} else {
					System.out.println("오답입니다! 현재 맞힌 문제 수 : " + numberOfAnswer + " / 30");
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
				System.out.println("모든 문제를 맞히셨습니다. 축하합니다.");
				break;
			}
			while (check[checkIndex] == 1) {
				checkIndex = random.nextInt(30);
			}
			while (true) {
				System.out.print(vocaArr[checkIndex].split(" ")[1] + "의 뜻은? >> ");
				String ans = sc.next();
				if (ans.equals(vocaArr[checkIndex].split(" ")[0])) {
					numberOfAnswer += 1;
					System.out.println("정답입니다! 현재 맞힌 문제 수 : " + numberOfAnswer + " / 30");
					check[checkIndex] = 1;
					break;
				} else {
					System.out.println("오답입니다! 현재 맞힌 문제 수 : " + numberOfAnswer + " / 30");
				}
			}
		}
	}

	public void showWords(String[] vocaArr) {
		sc = new Scanner(System.in);

		int i = 0;
		String str = "n";

		System.out.println("n : 다음 단어");
		System.out.println("p : 이전 단어");
		System.out.println("exit : 나가기");

		while (true) {
			if ("n".equals(str)) {
				i = (i + 1) % vocaArr.length;
			} else if ("p".equals(str)) {
				i = (i + 29) % vocaArr.length;
			} else if ("exit".equals(str)) {
				System.out.println("처음 화면으로 이동.");
				return;
			}

			System.out.print(vocaArr[i].split(" ")[0] + " ");
			System.out.println(vocaArr[i].split(" ")[1]);
			str = sc.nextLine();
		}
	}
}