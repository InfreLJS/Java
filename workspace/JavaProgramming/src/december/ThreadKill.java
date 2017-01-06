package december;

public class ThreadKill {

	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		try {
			Thread.sleep(1000 * 30);
		} catch (InterruptedException e) {

		}
		th.interrupt();
	}

}
