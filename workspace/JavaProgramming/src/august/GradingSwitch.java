package august;


import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		switch (a.nextInt() / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("������ " + grade + "�Դϴ�.");
		
		a.close();
	}

}
