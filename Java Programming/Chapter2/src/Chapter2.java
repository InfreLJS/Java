import java.util.Scanner;
public class Chapter2 {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		
		System.out.println("�ʸ� �Է����ּ���: ");
		int cho= num.nextInt();
		if(cho<60){
			System.out.println(cho+"�� �Դϴ�.");
		}
		else if(cho>60 && cho<3600){
			int cho2=cho%60;
			int boon=(cho-cho2)/60;
			System.out.println(boon+"��"+cho2+"�� �Դϴ�.");
		}
		else{
			int si=cho/3600;
			int boon=(cho%3600)/60;
			int cho3=(cho%3600)%60;
			System.out.println(si+"��"+boon+"��"+cho3+"�� �Դϴ�.");
		}
	}

}
