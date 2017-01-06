package november;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void PrintSet(Set<String> obj) {
		System.out.println("----------------");
		int size = obj.size();

		System.out.println("Set에 저장된 총 객체수는 " + size);
		System.out.printf("%-25s", "for 반복문을 사용 : ");
		for (String val : obj) {
			System.out.print(val + " ");
		}

		System.out.printf("\n%-24s", "Iter와 while 반복문을 사용 : ");
		Iterator<String> iter = obj.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Set<String> obj = new HashSet<String>();

		obj.add("Java");
		obj.add("JDBC");
		obj.add("Servlet/JSP");
		obj.add("Java");
		obj.add("iBATIS");
		PrintSet(obj);

		obj.remove("JDBC");
		obj.remove("iBATIS");

		obj.clear();
		PrintSet(obj);
	}
}
