package test;

public class Hangul {

	public static void main(String[] args) {
		for (char c = 0xac00; c <= 0xd7a3; c++) {
			System.out.print(c);
			if (c % 60 == 0) {
				System.out.println();
			}
		}
	}

}
