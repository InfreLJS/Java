import java.util.Scanner;
public class ScannerEx2 {
	public static Scanner scanner;
	public static void main(String[] args){
		
		scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�: ");
		int num1=scanner.nextInt();
		
		System.out.println("�ι�° ���� �Է�: ");
		int num2=scanner.nextInt();
		
		System.out.println("����° ���� �Է�: ");
		int num3=scanner.nextInt();
		
		if(num1>(num2+num3) || num2>(num1+num3) || num3>(num1+num2)){
			System.out.println("�ﰢ���� ������� �� �����ϴ�.");
		}
		else{
			System.out.println("�ﰢ���� ������� �� �ֽ��ϴ�. ");
		}
	}

}
