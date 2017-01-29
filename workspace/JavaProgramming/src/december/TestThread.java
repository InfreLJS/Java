package december;

import java.awt.Toolkit;

public class TestThread {

	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();

		Thread th2 = new Thread(new TimerThread2());
		th2.start();

		Thread th3 = new Thread() {
			int n = 0;

			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				while (true) {
					System.out.println(n);
					n++;
					try {
						sleep(100);
						toolkit.beep();
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		};
		th3.start();
	}

}
