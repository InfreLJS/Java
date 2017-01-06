package november;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		StringTokenizer newst = new StringTokenizer("È«±æµ¿//ÀåÈ­//È«·Ã//ÄáÁã//ÆÏÁã", "/");
		while (newst.hasMoreTokens())
			System.out.println(newst.nextToken());

	}

}
