import java.util.Scanner;
public class SwitchCase {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner button= new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score=button.nextInt();
		char grade=0;
		
			switch(score/10){
			case 10:
			case 9:
				grade='A';
				System.out.println("등급은: "+grade+"입니다.");
				break;
			case 8:
			    grade='B';
			    System.out.println("등급은: "+grade+"입니다.");
			    break;
			case 7:
			case 6:
				grade='C';
				System.out.println("등급은: "+grade+"입니다.");
				break;
			case 5:
				grade='D';
				System.out.println("등급은: "+grade+"입니다.");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				grade='F';
				System.out.println("등급은: "+grade+"입니다.");
				break;
				default:
					System.out.println("수가 작거나 초과되었습니다.");
					break;
			}
			
		}
	

}
