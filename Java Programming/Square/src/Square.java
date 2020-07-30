import java.util.Scanner;
public class Square {
	public static Scanner scanner;
	public static void main(String args[]){
		
		Scanner value=new Scanner(System.in);
		
		System.out.println("x 좌표를 입력해주세요: ");
		int x=value.nextInt();
		System.out.println("y 좌표를 입력해주세요: ");
		int y=value.nextInt();
		
		if(x>=50 && x<=100 && y>=50 && y<=100){
			System.out.println("사각형 안에 점이 있습니다.");
		}
		else{
			System.out.println("사각형 안에 점이 없습니다.");
		}
	}

}
