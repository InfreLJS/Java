package october;
class Person2 {
}

class Student extends Person2 {
}

class Researcher extends Person2 {
}

class Professor extends Researcher {
}

public class InstanceOfEx {

	public static void main(String[] args) {
		Person2 jee = new Student();
		Person2 kim = new Professor();
		Person2 lee = new Researcher();

		if (jee instanceof Student) {
			System.out.println("jee는 Student 타입");
		}
		if (jee instanceof Researcher) {
			System.out.println("jee는 Researcher 타입");
		}
		if (kim instanceof Student) {
			System.out.println("kim는 Student 타입");
		}
		if (kim instanceof Researcher) {
			System.out.println("kim는 Researcher 타입");
		}
		if (kim instanceof Professor) {
			System.out.println("kim는 Professor 타입");
		}
		if (kim instanceof Person2) {
			System.out.println("kim는 Person2 타입");
		}
		if (lee instanceof Professor) {
			System.out.println("lee는 Professor 타입");
		}
	}

}
