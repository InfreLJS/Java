package november;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		StringTokenizer newst = new StringTokenizer("ȫ�浿//��ȭ//ȫ��//����//����", "/");
		while (newst.hasMoreTokens())
			System.out.println(newst.nextToken());

	}

}
