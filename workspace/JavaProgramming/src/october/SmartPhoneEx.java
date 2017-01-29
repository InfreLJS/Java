package october;

public class SmartPhoneEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.sendCall();
		MobliePhone mp = phone;
		MP3 mp3 = phone;
		MusicPhone musicp = phone;
	}

}
