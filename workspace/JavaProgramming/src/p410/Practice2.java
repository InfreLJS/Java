package p410;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();

		for (int i = 0; i < 5; i++) {
			a.add(sc.next().charAt(0));
		}

		for (int i = 0; i < a.size(); i++) {
			double score = 0;
			switch (a.get(i)) {
			case 'A':
				score = 4.0;
				break;
			case 'B':
				score = 3.0;
				break;
			case 'C':
				score = 2.0;
				break;
			case 'D':
				score = 1.0;
				break;
			case 'F':
				score = 0;
				break;
			}
			System.out.print(score + " ");
		}

		sc.close();
	}

}
