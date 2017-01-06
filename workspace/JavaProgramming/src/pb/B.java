package pb;

public class B extends A {

	void set() {
		i = 1;
		pro = 2;
		// pri = 3;
		pub = 4;
	}

	public static void main(String[] args) {
		B b = new B();
		b.set();
	}

}
