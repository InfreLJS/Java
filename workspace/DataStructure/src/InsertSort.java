
public class InsertSort {

	public static void main(String[] args) {
		int[] numbers = { 11, 9, 15, 5, 2 };
		InsertSort.insertSort(numbers);
	}

	public static void insertSort(int[] numbers) {
		int i, j, countOfChange = 0, countOfCompare = 0;

		for (i = 1; i <= numbers.length - 1; i++) {
			int temp = numbers[i];

			for (j = i - 1; j >= 0; j--) {
				countOfCompare++;
				if (numbers[j] > temp) {
					numbers[j + 1] = numbers[j];
				} else {
					break;
				}
			}
			countOfChange++;
			numbers[j + 1] = temp;
		}

		for (i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("ºñ±³ È½¼ö : " + countOfCompare + " ±³È¯ È½¼ö : " + countOfChange);
	}
}
