import java.io.*;
import java.util.Random;

public class SampleAverage {
	public static void main(String[] args) throws IOException {
		final int TIMES = 50000;

		double[] M = new double[1000];
		double[] X = new double[TIMES];
		double V = 0;
		double d = 0, sum;
		int index;
		Random rd = new Random();

		BufferedReader in = new BufferedReader(
				new FileReader("D:\\Google 드라이브\\DSM\\FirstGrade\\Formal Education\\확률과 통계 엑셀 파일\\모집단.txt"));

		for (int i = 0; i < 1000; i++) {
			M[i] = Double.parseDouble(in.readLine());
		}

		for (int i = 0; i < TIMES; i++) {
			sum = 0;
			for (int j = 0; j < 10; j++) {
				index = rd.nextInt(1000);
				sum += M[index];
			}
			X[i] = sum / 10;
			d += X[i];
			System.out.println(X[i]);
		}
		System.out.println();
		System.out.println(d / TIMES);
		sum = 0;

		for (int i = 0; i < TIMES; i++) {
			V += (X[i] - (d / TIMES)) * (X[i] - (d / TIMES));
		}
		V /= TIMES;
		System.out.println(V);
		System.out.println(Math.sqrt(V));

		in.close();
	}
}
