package openChallenge;

import java.util.Scanner;

public class GBBGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String winner = "";
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String chulsu = sc.next();
		System.out.print("영희 >> ");
		String yeonghee = sc.next();
		if (chulsu.equals("가위")) {
			if (yeonghee.equals("가위"))
				winner = "비";
			if (yeonghee.equals("바위"))
				winner = "영희가 이";
			if (yeonghee.equals("보"))
				winner = "철수가 이";
		} else if (chulsu.equals("바위")) {
			if (yeonghee.equals("보"))
				winner = "영희가 이";
			if (yeonghee.equals("가위"))
				winner = "철수가 이";
			if (yeonghee.equals("바위"))
				winner = "비";
		} else if (chulsu.equals("보")) {
			if (yeonghee.equals("가위"))
				winner = "영희가 이";
			if (yeonghee.equals("바위"))
				winner = "철수가 이";
			if (yeonghee.equals("보"))
				winner = "비";
		}
		System.out.println(winner + "겼습니다.");
		
		sc.close();
	}

}
