package november;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollectionEx {

	public static void main(String[] args) {
		List<String> lstArray = new ArrayList<String>();
		List<String> lstLL = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			lstArray.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			lstLL.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + " ns");
	}

}
