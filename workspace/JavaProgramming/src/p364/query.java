package p364;

public class query {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("usage : java query \"tag1=value1&tag2=value2&...\"");
		} else {
			String[] texts = args[0].split("&");
			for (int i = 0; i < texts.length; i++) {
				try {
					System.out.println(texts[i].split("=")[0] + "\t" + texts[i].split("=")[1]);
				} catch (Exception e) {
					System.out.println("usage : java query \"tag1=value1&tag2=value2&...\"");
				}
			}
		}
	}

}
