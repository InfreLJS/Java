package august;


public class UseArray {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr3 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 5; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(arr3[i]);
		}

	}

}
