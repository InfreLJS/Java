package october;
class Oct5_A {
	public Oct5_A(int x) {
		System.out.println("持失切 Oct5_A");
	}
}

class Oct5_B extends Oct5_A {
	public Oct5_B() {
		super(1);
		System.out.println("持失切 Oct5_B");
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Oct5_B b = new Oct5_B();
	}

}
