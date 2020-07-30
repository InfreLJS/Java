package october;
abstract class Oct12_DObject {
	public Oct12_DObject next;

	abstract public void draw();
}

public class AbstractError {
	public static void main(String args) {
		@SuppressWarnings("unused")
		Oct12_DObject obj;
		// obj = new Oct12_DObject();
		// obj.draw();
	}

}
