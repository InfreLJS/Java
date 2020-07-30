package september;
class Shape {
	int numberOfDot;
	String shapeName;

	void showShape() {
		System.out.println(" ����Դϴ�.");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		numberOfDot = 4;
		shapeName = "�簢��";
	}

	void showRectangle() {
		System.out.print(shapeName);
		showShape();
	}
}

class Triangle extends Shape {
	public Triangle() {
		numberOfDot = 3;
		shapeName = "�ﰢ��";
	}

	void showTriangle() {
		System.out.print(shapeName);
		showShape();
	}
}

class Circle extends Shape {
	public Circle() {
		numberOfDot = 0;
		shapeName = "��";
	}

	void showCircle() {
		System.out.print(shapeName);
		showShape();
	}
}

public class Sep28_ShapeMain {

	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();

		myRectangle.showRectangle();
		myTriangle.showTriangle();
		myCircle.showCircle();
		System.out.println("\n�簢���� ������ ���� " + myRectangle.numberOfDot + "��");
		System.out.println("�ﰢ���� ������ ���� " + myTriangle.numberOfDot + "��");
		System.out.println("���� ������ ���� " + myCircle.numberOfDot + "��");
	}

}
