import java.io.*;
import java.util.Random;

public class SampleAverageMac {
	public static void main(String[] args) {
		final int TIMES = 100;
		final String FILENAME = "";

		double[] M = new double[1000];
		double[] X = new double[TIMES];
		double V = 0, E = 0;
		double d = 0, sum;
		int index;
		Random rd = new Random();

		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(FILENAME));

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
			E = d / TIMES;
			System.out.println();
			System.out.println(E);
			sum = 0;

			for (int i = 0; i < TIMES; i++) {
				V += (X[i] - E) * (X[i] - E);
			}
			V /= TIMES;
			System.out.println(V);
			// System.out.println((d2 / TIMES) - (E * E));

			System.out.println(Math.sqrt(V));

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
