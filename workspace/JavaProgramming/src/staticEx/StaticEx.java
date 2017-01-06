package staticEx;

class StaticEnemy {
	public StaticEnemy() {
		numOfEnemy++;
	}

	public void ShowNumOfEnemy() {
		System.out.println("���� ���� " + numOfEnemy + "�Դϴ�.");
	}

	private static int numOfEnemy = 0;
}

public class StaticEx {

	public static void main(String[] args) {
		StaticEnemy e1 = new StaticEnemy();
		e1.ShowNumOfEnemy();
		StaticEnemy e2 = new StaticEnemy();
		e2.ShowNumOfEnemy();
		StaticEnemy e3 = new StaticEnemy();
		e3.ShowNumOfEnemy();
	}

}
