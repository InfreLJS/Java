package checkTime;

// 2016년 8월 28일 일요일
// 이재석

import java.util.Scanner;

public class P80_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하세요. >> ");
		System.out.println("합 : " + (sc.nextInt() + sc.nextInt()));
		
		sc.close();
	}

}
