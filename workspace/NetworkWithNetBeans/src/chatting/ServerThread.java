package chatting;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerThread extends Thread {
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	ChattingProtocol messageSet;
	HashMap<String, ServerThread> map;
	HashMap<String, String> userMap;

	private String ID;
	String message;

	public ServerThread(Socket socket, HashMap<String, ServerThread> map, HashMap<String, String> userMap) {
		try {
			this.socket = socket;
			this.map = map;
			this.userMap = userMap;
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			logIn(map, userMap);
		} catch (IOException | ClassNotFoundException e) {
		}
		System.out.println(Utils.getTime() + " " + this.ID + " 연결됨.");
		while (true) {
			receiveMessage(map);
		}
	}

	public void logIn(HashMap<String, ServerThread> map, HashMap<String, String> userMap)
			throws IOException, ClassNotFoundException {
		while (true) {
			System.out.println("로그인 대기 중");
			messageSet = (ChattingProtocol) ois.readObject();
			if (messageSet.target.equals("SERVER") || messageSet.control == 1) {
				ID = messageSet.from;
				if (userMap.containsKey(ID)) {
					if (userMap.get(ID).equals(messageSet.message)) {
						oos.writeObject(new ChattingProtocol(Utils.LOG_IN_SUCCESS, "SERVER", ID, 1, false));
						oos.flush();
						return;
					} else {
						oos.writeObject(new ChattingProtocol(Utils.LOG_IN_FAILURE_PW, "SERVER", ID, 1, false));
						oos.flush();
					}
				} else {
					oos.writeObject(new ChattingProtocol(Utils.LOG_IN_FAILURE_ID, "SERVER", ID, 1, false));
					oos.flush();
				}
			} else {
				System.out.println("잘못된 로그인 정보!");
				oos.writeObject(new ChattingProtocol(null, "SERVER", ID, 3, false));
				oos.flush();
			}
		}
	}

	public void receiveMessage(HashMap<String, ServerThread> map) {
		try {
			ChattingProtocol messageSet = (ChattingProtocol) ois.readObject();
			switch (messageSet.control) {
			case 0:
				if (messageSet.isToAll) {
					Iterator stit = map.keySet().iterator();
					while (stit.hasNext()) {
						map.get(stit.next()).sendMessage(messageSet);
					}
				} else {
					map.get(messageSet.target).sendMessage(messageSet);
				}
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
		} catch (IOException | ClassNotFoundException e) {
		}
	}

	public void sendMessage(ChattingProtocol messageSet) {
		try {
			oos.writeObject(messageSet);
			oos.flush();
		} catch (IOException e) {

		}
	}
}
