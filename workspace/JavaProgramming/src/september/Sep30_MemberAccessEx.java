package september;
class Sep30_A {
	public int p;
	private int n;

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}
}

class Sep30_B extends Sep30_A {
	private int m;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
}

public class Sep30_MemberAccessEx {

	public static void main(String[] args) {
		Sep30_A a = new Sep30_A();
		Sep30_B b = new Sep30_B();

		a.p = 5;
		// a.n = 5;

		b.p = 5;
		// b.n = 5;

		b.setN(10);
		@SuppressWarnings("unused")
		int i = b.getN();

		// b.m = 5;
		b.setM(20);
		System.out.println(b.toString());
	}

}
