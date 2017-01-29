package october;
public class MP3Player {
	final int MAX_VOLUME = 15;
	int volume;
	int battery;
	boolean isPlaying = false;
	boolean isCharging = false;

	public void songPlay(String songName) {
		isPlaying = true;
		System.out.println(songName + "을 재생합니다.");
	}

	public void songStop() {
		if (isPlaying) {
			isPlaying = false;
			System.out.println("노래 재생을 중지합니다.");
		} else {
			System.out.println("노래 실행 중이 아닙니다.");
		}
	}

	public void volumeUp() {
		if (volume >= MAX_VOLUME) {
			System.out.println("현재 볼륨이 최고입니다.");
		} else {
			volume += 1;
			System.out.println("현재 볼륨 : " + volume);
		}
	}

	public void volumeDown() {
		if (volume <= 0) {
			System.out.println("현재 볼륨이 최저입니다.");
		} else {
			volume -= 1;
			System.out.println("현재 볼륨 : " + volume);
		}
	}

	public void charging() {
		isCharging = true;
		if (battery >= 100) {
			System.out.println("현재 배터리가 최고입니다.");
		} else {
			battery += 1;
			System.out.println("현재 배터리 : " + battery);
		}
	}

	public void discharing() {
		isCharging = false;
		if (battery <= 0) {
			System.out.println("배터리 부족으로 종료합니다.");
			powerOff();
		} else {
			battery -= 1;
			System.out.println("현재 배터리 : " + battery);
		}
	}

	public void powerOff() {
		System.out.println("종료");
	}

	public void powerOn() {
		System.out.println("환영합니다.");
	}
}
