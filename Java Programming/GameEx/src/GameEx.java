import java.util.Scanner;
public class GameEx {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int change1=0, change2=0,cnt=0;
		System.out.println("1-99������ ������ �ϳ� �Է�: ");
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
			System.out.println("¦¦!");
			}
			else if(cnt==1){
			System.out.println("¦!");
			}
			else if(cnt==0){
			System.out.println("(��ȯ����)" + "-->"+num);
			}
			else{
			return;
			}
		}
		else{
			System.out.println("�ٽ� �Է�!");
			return;
		}
		
	}

}
