package october;
abstract class Oct12_Calculator {
	abstract public int add(int a, int b);

	abstract public int subtract(int a, int b);

	abstract public double average(int[] a);
}

class Oct12_GoodCalc extends Oct12_Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double average(int[] a) {
		double avg = 0;
		for (int i : a) {
			avg += i;
		}
		return avg / a.length;
	}

}

public class CalculatorEx {

	public static void main(String[] args) {
		Oct12_Calculator c = new Oct12_GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 }));
	}

}
