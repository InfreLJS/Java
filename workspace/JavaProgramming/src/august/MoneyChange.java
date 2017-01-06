package august;
import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("돈의 액수를 입력하세요 : ");
		int money = sc.nextInt();

		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] unitAmount = new int[unit.length];

		for (int i = 0; i < unit.length; i++) {
			unitAmount[i] = money / unit[i];
			money %= unit[i];
		}
		for (int i = 0; i < unit.length; i++) {
			if (unitAmount[i] != 0) {
				if (i < 4)
					System.out.println(Integer.toString(unit[i]) + "원권 " + unitAmount[i] + "매");
				else
					System.out.println(Integer.toString(unit[i]) + "원 짜리 동전 " + unitAmount[i] + "개");
			}
		}
		
		sc.close();
	}

}
