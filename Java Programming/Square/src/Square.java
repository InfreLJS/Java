import java.util.Scanner;
public class Square {
	public static Scanner scanner;
	public static void main(String args[]){
		
		Scanner value=new Scanner(System.in);
		
		System.out.println("x ��ǥ�� �Է����ּ���: ");
		int x=value.nextInt();
		System.out.println("y ��ǥ�� �Է����ּ���: ");
		int y=value.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100){
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		}
		else{
			System.out.println("�簢�� �ȿ� ���� �����ϴ�.");
		}
	}

}
