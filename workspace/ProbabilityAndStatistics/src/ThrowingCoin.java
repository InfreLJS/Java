import java.util.Random;
import java.util.Scanner;

public class ThrowingCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int count = 0;

		System.out.print("�ݺ� Ƚ�� �Է� : ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			if (rd.nextInt(2) == 0)
				count++;
		}

		System.out.println("�ո� : " + count);
		System.out.println("�޸� : " + (a - count));
		System.out.println("Ȯ�� : " + (double) count / a);
		
		sc.close();
	}

}
