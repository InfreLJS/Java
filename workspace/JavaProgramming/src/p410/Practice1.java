package p410;

import java.util.Scanner;
import java.util.Vector;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Float> v = new Vector<Float>();

		for (int i = 0; i < 10; i++) {
			v.add(sc.nextFloat());
		}

		int largestIndex = 0;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(largestIndex) < v.get(i)) {
				largestIndex = i;
			}
		}

		System.out.println("가장 큰 실수는 " + v.get(largestIndex));
		
		sc.close();
	}

}
