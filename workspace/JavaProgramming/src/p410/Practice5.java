package p410;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();

		for (int i = 0; i < 5; i++) {
			System.out.print("�̸�, �а�, �й�, ���� ����� �Է��ϼ��� >> ");
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
		return "�̸� : " + this.name + "\t�а� : " + this.department + "\t�й� : " + this.id + "\t���� ��� : " + this.avg;
	}
}
