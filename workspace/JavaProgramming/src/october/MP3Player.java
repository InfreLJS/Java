package october;
public class MP3Player {
	final int MAX_VOLUME = 15;
	int volume;
	int battery;
	boolean isPlaying = false;
	boolean isCharging = false;

	public void songPlay(String songName) {
		isPlaying = true;
		System.out.println(songName + "�� ����մϴ�.");
	}

	public void songStop() {
		if (isPlaying) {
			isPlaying = false;
			System.out.println("�뷡 ����� �����մϴ�.");
		} else {
			System.out.println("�뷡 ���� ���� �ƴմϴ�.");
		}
	}

	public void volumeUp() {
		if (volume >= MAX_VOLUME) {
			System.out.println("���� ������ �ְ��Դϴ�.");
		} else {
			volume += 1;
			System.out.println("���� ���� : " + volume);
		}
	}

	public void volumeDown() {
		if (volume <= 0) {
			System.out.println("���� ������ �����Դϴ�.");
		} else {
			volume -= 1;
			System.out.println("���� ���� : " + volume);
		}
	}

	public void charging() {
		isCharging = true;
		if (battery >= 100) {
			System.out.println("���� ���͸��� �ְ��Դϴ�.");
		} else {
			battery += 1;
			System.out.println("���� ���͸� : " + battery);
		}
	}

	public void discharing() {
		isCharging = false;
		if (battery <= 0) {
			System.out.println("���͸� �������� �����մϴ�.");
			powerOff();
		} else {
			battery -= 1;
			System.out.println("���� ���͸� : " + battery);
		}
	}

	public void powerOff() {
		System.out.println("����");
	}

	public void powerOn() {
		System.out.println("ȯ���մϴ�.");
	}
}
