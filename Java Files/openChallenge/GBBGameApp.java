package openChallenge;

import java.util.Scanner;

public class GBBGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String winner = "";
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >> ");
		String chulsu = sc.next();
		System.out.print("���� >> ");
		String yeonghee = sc.next();
		if (chulsu.equals("����")) {
			if (yeonghee.equals("����"))
				winner = "��";
			if (yeonghee.equals("����"))
				winner = "���� ��";
			if (yeonghee.equals("��"))
				winner = "ö���� ��";
		} else if (chulsu.equals("����")) {
			if (yeonghee.equals("��"))
				winner = "���� ��";
			if (yeonghee.equals("����"))
				winner = "ö���� ��";
			if (yeonghee.equals("����"))
				winner = "��";
		} else if (chulsu.equals("��")) {
			if (yeonghee.equals("����"))
				winner = "���� ��";
			if (yeonghee.equals("����"))
				winner = "ö���� ��";
			if (yeonghee.equals("��"))
				winner = "��";
		}
		System.out.println(winner + "����ϴ�.");
		
		sc.close();
	}

}
