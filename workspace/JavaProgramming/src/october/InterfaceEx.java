package october;
public class InterfaceEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		tv.turnOff();
		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true);
		tv.setMute(false);
		tv.search("한국신문");
		RemoteControl.changeBattery();
		RemoteControl rc = tv;
		Searchable sc = tv;
	}

}
