package p412;

class MyClass<E> {
	private Object s;

	public MyClass(E s) {
		this.s = s;
	}

	void setS(E s) {
		this.s = s;
	}

	@SuppressWarnings("unchecked")
	E getS() {
		return (E) s;
	}
}

public class MyClassEx {

	public static void main(String[] args) {
		MyClass<String> stringClass = new MyClass<String>("String");
		System.out.println(stringClass.getS());
	}

}
