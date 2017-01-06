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

		System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >>> ");

		while (true) {
			selDo = sc.nextInt();
			if (selDo == 1 || selDo == 2 || selDo == 3 || selDo == 4) {
				break;
			} else {
				System.out.print("잘못 입력하셨습니다. 다시 입력하세요 >> ");
			}
		}

		switch (selDo) {
		case 1:
			System.out.print("좌석구분 S(1), A(2), B(3) >>> ");
			while (true) {
				selSeat = sc.nextInt();
				if (selSeat == 1 || selSeat == 2 || selSeat == 3) {
					break;
				} else {
					System.out.print("잘못 입력하셨습니다. 다시 입력하세요 >> ");
				}
			}

			System.out.println("S>> " + seatArray[selSeat - 1]);
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.println(name.length());
			System.out.print("번호 >> ");
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
