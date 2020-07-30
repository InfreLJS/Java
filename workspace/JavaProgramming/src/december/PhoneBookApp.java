package december;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Phone> map = new HashMap<String, Phone>();

		System.out.println("------------------------------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
		System.out.println("------------------------------------------------------------");
		while (true) {
			System.out.print("삽입:0,  삭제:1,  찾기:2,  전체보기:3,  종료:4 >> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 0:
				System.out.print("이름 >> ");
				String name = sc.nextLine();
				System.out.print("전화번호 >> ");
				String phoneNum = sc.nextLine();
				System.out.print("주소 >> ");
				String address = sc.nextLine();
				map.put(name, new Phone(name, address, phoneNum));
				break;
			case 1:
				
			}
		}
	}

}

class Phone {
	String name;
	String address;
	String phoneNum;

	public Phone(String name, String address, String phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
}