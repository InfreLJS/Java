package checkTime;

// 2016�� 8�� 28�� �Ͽ���
// ���缮

import java.util.Scanner;

public class P80_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���. >> ");
		String line = sc.nextLine();
		for (String s : line.split(" ")) {
			System.out.println(s);
		}
		System.out.println("�ܾ��� ���� : " + line.split(" ").length);

		sc.close();
	}

}
