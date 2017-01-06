package p410;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름, 학과, 학번, 학점 평균을 입력하세요 >> ");
			a.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextFloat()));
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		sc.close();
	}

}

class Student {
	String name;
	String department;
	int id;
	float avg;

	public Student(String name, String department, int id, float avg) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.avg = avg;
	}

	public String toString() {
		return "이름 : " + this.name + "\t학과 : " + this.department + "\t학번 : " + this.id + "\t학점 평균 : " + this.avg;
	}
}
