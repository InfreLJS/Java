package october;
class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject Draw");
	}
}

class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 extends DObject {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;

		obj.draw();
		line.draw();
		p.draw();
		r.draw();

		DObject rect = new Rect();
		DObject circle = new Circle2();
		rect.draw();
		circle.draw();
	}

}