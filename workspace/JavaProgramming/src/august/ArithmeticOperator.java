package august;


import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. >> ");
		time = sc.nextInt();
		System.out.println(time / 3600 + "�ð� " + (time / 60) % 60 + "�� " + time % 60 + "��");
		
		sc.close();
	}

}
