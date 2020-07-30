import java.util.Scanner;
public class ScannerEx2 {
	public static Scanner scanner;
	public static void main(String[] args){
		
		scanner = new Scanner(System.in);
		
		System.out.println("첫번째 길이 입력: ");
		int num1=scanner.nextInt();
		
		System.out.println("두번째 길이 입력: ");
		int num2=scanner.nextInt();
		
		System.out.println("세번째 길이 입력: ");
		int num3=scanner.nextInt();
		
		if(num1>(num2+num3) || num2>(num1+num3) || num3>(num1+num2)){
			System.out.println("삼각형이 만들어질 수 없습니다.");
		}
		else{
			System.out.println("삼각형이 만들어질 수 있습니다. ");
		}
	}

}
