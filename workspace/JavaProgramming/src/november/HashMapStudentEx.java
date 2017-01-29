package november;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("한원선", new Student(2, "010-222-2222"));
		students.put("황기태", new Student(1, "010-111-1111"));
		students.put("이영환", new Student(3, "010-333-3333"));

		System.out.println("HashMap의 요소 개수 : " + students.size());

		Set<String> keys = students.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Student student = students.get(name);
			System.out.println(name + " : " + student.id + " " + student.telnum);
		}
	}
}

class Student {
	int id;
	String telnum;

	public Student(int id, String telnum) {
		this.id = id;
		this.telnum = telnum;
	}
}