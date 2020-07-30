package september;
import java.util.Scanner;

public class Sep21_Reserve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selDo, selSeat;
		String[] seatArray = { "___ ___ ___ ___ ___ ___ ___ ___ ___ ___", "___ ___ ___ ___ ___ ___ ___ ___ ___ ___",
				"___ ___ ___ ___ ___ ___ ___ ___ ___ ___" };
		@SuppressWarnings("unused")
		String[] seatNameArray = { "S", "A", "B" };

		System.out.print("����(1), ��ȸ(2), ���(3), ������(4) >>> ");

		while (true) {
			selDo = sc.nextInt();
			if (selDo == 1 || selDo == 2 || selDo == 3 || selDo == 4) {
				break;
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ��� >> ");
			}
		}

		switch (selDo) {
		case 1:
			System.out.print("�¼����� S(1), A(2), B(3) >>> ");
			while (true) {
				selSeat = sc.nextInt();
				if (selSeat == 1 || selSeat == 2 || selSeat == 3) {
					break;
				} else {
					System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ��� >> ");
				}
			}

			System.out.println("S>> " + seatArray[selSeat - 1]);
			System.out.print("�̸� >> ");
			String name = sc.next();
			System.out.println(name.length());
			System.out.print("��ȣ >> ");
			int number = sc.nextInt();
			seatArray[selSeat - 1] = changeSeat(name, number, seatArray[selSeat - 1]);
			System.out.println(seatArray[selSeat - 1]);
		}

		sc.close();
	}

	public static String changeSeat(String name, int number, String seat) {
		StringBuffer sb = new StringBuffer();
		int beforeSpace = number - 1;
		int afterSpace = beforeSpace + name.length();
		sb.append(seat.substring(0, beforeSpace * 4));
		sb.append(name + " ");
		sb.append(seat.substring(afterSpace));
		return sb.toString();
	}
}
