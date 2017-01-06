package staticEx;

class NonStaticEnemy {
	public NonStaticEnemy() {
		numOfEnemy++;
	}

	public void ShowNumOfEnemy() {
		System.out.println("���� ���� " + numOfEnemy + "�Դϴ�.");
	}

	private int numOfEnemy = 0;
}

public class NonStaticEx {

	public static void main(String[] args) {
		NonStaticEnemy e1 = new NonStaticEnemy();
		NonStaticEnemy e2 = new NonStaticEnemy();
		NonStaticEnemy e3 = new NonStaticEnemy();

		e1.ShowNumOfEnemy();
		e2.ShowNumOfEnemy();
		e3.ShowNumOfEnemy();
	}

}
