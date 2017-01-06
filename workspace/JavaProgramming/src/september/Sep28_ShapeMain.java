package september;
class Shape {
	int numberOfDot;
	String shapeName;

	void showShape() {
		System.out.println(" 모양입니다.");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		numberOfDot = 4;
		shapeName = "사각형";
	}

	void showRectangle() {
		System.out.print(shapeName);
		showShape();
	}
}

class Triangle extends Shape {
	public Triangle() {
		numberOfDot = 3;
		shapeName = "삼각형";
	}

	void showTriangle() {
		System.out.print(shapeName);
		showShape();
	}
}

class Circle extends Shape {
	public Circle() {
		numberOfDot = 0;
		shapeName = "원";
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
		System.out.println("\n사각형의 꼭짓점 수는 " + myRectangle.numberOfDot + "개");
		System.out.println("삼각형의 꼭짓점 수는 " + myTriangle.numberOfDot + "개");
		System.out.println("원의 꼭짓점 수는 " + myCircle.numberOfDot + "개");
	}

}
