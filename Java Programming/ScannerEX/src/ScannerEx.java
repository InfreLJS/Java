import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args){
		Scanner Ex=new Scanner(System.in);
		
		System.out.println("나이 입력: ");
		int age=Ex.nextInt();
		
		System.out.println("신장 입력: ");
		double height=Ex.nextDouble();
		
		System.out.println("체중 입력: ");
		int weight=Ex.nextInt();
		
		System.out.println();
		System.out.println("당신이 입력한 나이, 신장, 체중: "+age+"(세)||"+height+"(cm)||"+weight+"(kg)");
		
	}

}
