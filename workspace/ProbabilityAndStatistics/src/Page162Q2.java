import java.util.Random;
import java.util.Scanner;

public class Page162Q2 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("��ü �ݺ�Ƚ�� �Է� : ");
		int repeatTimes = sc.nextInt();
		System.out.print("���� Ƚ�� �Է� : ");
		int operationTimes = sc.nextInt();
		System.out.print("ī��Ʈ �� ¦�� ���� �Է� : ");
		int evenTimes = sc.nextInt();
		int i = 1, j, k = 0, evenCount = 0;
		
		while (i < repeatTimes) {
			j = 0;
			evenCount = 0;
			while (j < operationTimes) {
				int randomNumber = (rd.nextInt(5) + 1);
				if (randomNumber % 2 == 0)
					evenCount++;
				j++;
			}
			if (evenCount == evenTimes)
				k++;
			i++;
		}
		double p = k / repeatTimes;
		System.out.println("Ȯ�� : " + p);
		sc.close();
	}

}
