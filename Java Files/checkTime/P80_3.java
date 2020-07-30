package checkTime;

// 2016년 8월 28일 일요일
// 이재석

import java.util.Scanner;

public class P80_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. >> ");
		String line = sc.nextLine();
		for (String s : line.split(" ")) {
			System.out.println(s);
		}
		System.out.println("단어의 개수 : " + line.split(" ").length);

		sc.close();
	}

}
