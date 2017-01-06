import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		final int SIZE = 5;
		int[] arr = new int[SIZE];
		Scanner sc = new Scanner(System.in);
		int i = 0, j = 0;

		System.out.print("자료 " + arr.length + "개 입력 : ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}
