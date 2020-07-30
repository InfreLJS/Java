package emp;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpEx {
	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp("A111", 780000));
		emps.add(new Emp("B222", 450000));
		emps.add(new Emp("C333", 570000));

		Iterator<Emp> empsIterator = emps.iterator();
		System.out.println("  봉급계산서");
		System.out.println("================================================");
		System.out.println("사번      기본급         수당                세금                본봉          등급");
		System.out.println("================================================");
		while (empsIterator.hasNext())
			System.out.println(empsIterator.next());
	}
}