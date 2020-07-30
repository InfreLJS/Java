import java.util.Scanner;
public class IndexOut {
	public static Scanner scanner;
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int[] unit={50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int money=input.nextInt();
		
		int n=money/50000;
		int m=money%50000;
		int w=m/5000;
		int q=m%5000;
		int f=q/1000;
		int s=q%1000;
		int h=s/500;
		int v=s%500;
		
	}
	

}
