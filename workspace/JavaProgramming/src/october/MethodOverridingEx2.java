package october;
public class MethodOverridingEx2 {

	public static void main(String[] args) {
		DObject start, n, obj;

		start = new Line();
		
		n = start;
		obj = new Rect();
		n.next = obj;
		n = obj;
		obj = new Circle2();
		
		n.next = obj;

		while (start != null) {
			start.draw();
			start = start.next;
		}
	}

}