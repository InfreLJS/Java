import java.util.Scanner;
public class SwitchCase {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner button= new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int score=button.nextInt();
		char grade=0;
		
			switch(score/10){
			case 10:
			case 9:
				grade='A';
				System.out.println("�����: "+grade+"�Դϴ�.");
				break;
			case 8:
			    grade='B';
			    System.out.println("�����: "+grade+"�Դϴ�.");
			    break;
			case 7:
			case 6:
				grade='C';
				System.out.println("�����: "+grade+"�Դϴ�.");
				break;
			case 5:
				grade='D';
				System.out.println("�����: "+grade+"�Դϴ�.");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				grade='F';
				System.out.println("�����: "+grade+"�Դϴ�.");
				break;
				default:
					System.out.println("���� �۰ų� �ʰ��Ǿ����ϴ�.");
					break;
			}
			
		}
	

}
