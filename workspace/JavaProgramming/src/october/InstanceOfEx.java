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
			System.out.println("jee�� Student Ÿ��");
		}
		if (jee instanceof Researcher) {
			System.out.println("jee�� Researcher Ÿ��");
		}
		if (kim instanceof Student) {
			System.out.println("kim�� Student Ÿ��");
		}
		if (kim instanceof Researcher) {
			System.out.println("kim�� Researcher Ÿ��");
		}
		if (kim instanceof Professor) {
			System.out.println("kim�� Professor Ÿ��");
		}
		if (kim instanceof Person2) {
			System.out.println("kim�� Person2 Ÿ��");
		}
		if (lee instanceof Professor) {
			System.out.println("lee�� Professor Ÿ��");
		}
	}

}
