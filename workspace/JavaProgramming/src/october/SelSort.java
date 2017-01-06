package october;
import java.util.Scanner;

public class SelSort {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.print("���� 5���� �Է��ϼ���. : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		selSort(arr);

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		sc.close();
	}

	public static void selSort(int[] arr) {
		int temp, min;
		int changeCount = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			if (i != min) {
				changeCount++;
			}
		}

		System.out.println("�� �ܰ� ���� " + (arr.length - 1) + "ȸ �Դϴ�.");
		System.out.println("�ڸ� ��ȯ Ƚ���� " + changeCount + "ȸ �Դϴ�.");
	}
}
