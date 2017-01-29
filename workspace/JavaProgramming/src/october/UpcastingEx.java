package october;
class Oct5_Person {
	String name;
	String id;

	public Oct5_Person(String name) {
		this.name = name;
	}
}

class Oct5_Student extends Oct5_Person {
	String grade;
	String department;

	public Oct5_Student(String name) {
		super(name);
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		Oct5_Person p;
		Oct5_Student s = new Oct5_Student("¿Ã¿ÁπÆ");
		s.grade = "A";
		p = s;

		System.out.println(p.name);

		// p.grade = "A";
		// p.department = "Com";

		Oct5_Student s2 = (Oct5_Student) p;
		System.out.println(s2.grade);
	}

}