package august;


import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. >> ");
		time = sc.nextInt();
		System.out.println(time / 3600 + "시간 " + (time / 60) % 60 + "분 " + time % 60 + "초");
		
		sc.close();
	}

}
