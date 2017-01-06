package october;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" ab cd");
		String b = new String(",efg ");

		a = a.concat(b);
		System.out.println(a);

		a = a.trim();
		System.out.println(a);

		a = a.replace("ab", "12");
		System.out.println(a);

		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 " + i + "번째 문자열은 " + s[i]);
		}
	}
}
