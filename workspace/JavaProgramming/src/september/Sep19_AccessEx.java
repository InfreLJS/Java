package september;

public class Sep19_AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		// aClass.b = 10;
		aClass.c = 10;
	}

}

class Sample {
	public int a;
	private int b;
	int c;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}