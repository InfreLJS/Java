import java.util.Scanner;
public class GameEx {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int change1=0, change2=0,cnt=0;
		System.out.println("1-99까지의 정수중 하나 입력: ");
		int num=input.nextInt();
		change1=num/10;
		change2=num%10;
		
		if(num>=1 && num<=99){
			if(change1==3 || change1==6 || change1==9){
			cnt++;
			}
			if(change2==3 || change2==6 || change2==9){
			cnt++;
			}
			if(cnt==2){
			System.out.println("짝짝!");
			}
			else if(cnt==1){
			System.out.println("짝!");
			}
			else if(cnt==0){
			System.out.println("(변환없음)" + "-->"+num);
			}
			else{
			return;
			}
		}
		else{
			System.out.println("다시 입력!");
			return;
		}
		
	}

}
