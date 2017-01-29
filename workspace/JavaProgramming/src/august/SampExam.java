package august;
public class SampExam {
	public static void main(String[] args) {
		Samp a = new Samp("a", 4);
		Samp b = new Samp("b", 4);
		Samp c = new Samp("c", 4);

		a.set(5);
		b.set(6);
		c.set(7);

		System.out.println("set 후");
		System.out.println("a = " + a.get());
		System.out.println("b = " + b.get());
		System.out.println("c = " + c.get());
	}
}

class Samp {
	private int id;
	private String name;

	public Samp(String name, int id) {
		this.id = id;
		this.name = name;
		System.out.println('"' + name + '"' + " Samp 객체가 " + this.id + "로 id값이 초기화되어 생성됨");
	}

	public void set(int id) {
		this.id = id;
		System.out.println('"' + this.name + '"' + " Samp 객체가 " + this.id + "로 id값이 변경됨");
	}

	public int get() {
		return this.id;
	}

}