import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args){
		Scanner Ex=new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int age=Ex.nextInt();
		
		System.out.println("���� �Է�: ");
		double height=Ex.nextDouble();
		
		System.out.println("ü�� �Է�: ");
		int weight=Ex.nextInt();
		
		System.out.println();
		System.out.println("����� �Է��� ����, ����, ü��: "+age+"(��)||"+height+"(cm)||"+weight+"(kg)");
		
	}

}
