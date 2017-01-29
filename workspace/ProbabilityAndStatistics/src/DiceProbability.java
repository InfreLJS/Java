import java.util.Scanner;
import java.util.Random;

public class DiceProbability {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.print("횟수 입력 : ");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[6];
		double ProbabilityAverage = 0, variance = 0, standardDeviation = 0, times = sc.nextDouble();

		for (int i = 0; i < times; i++) {
			arr[random.nextInt(6)] += 1;
		}

		for (int i = 0; i < 6; i++) {
			ProbabilityAverage += ((i + 1) * (arr[i] / times));
		}

		for (int i = 0; i < 6; i++) {
			variance += Math.pow(ProbabilityAverage - (i + 1), 2);
		}
		variance /= 6;
		standardDeviation = Math.sqrt(variance);

		System.out.println("분산 : " + variance);
		System.out.println("표준편차 : " + standardDeviation);

		sc.close();
	}

}
