package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MultiChattingServer {

	public static void main(String[] args) {
		HashMap<String, ServerThread> map = new HashMap<>();
		HashMap<String, String> userMap = new HashMap<>();
		try {
			ServerSocket serverSocket = new ServerSocket(SocketConfig.PORT);
			userMap.put("test", "1234");

			while (true) {
				System.out.println(Utils.getTime() + " 연결 요청 대기중...");
				Socket socket = serverSocket.accept();

				new ServerThread(socket, map, userMap).start();
			}
		} catch (IOException e) {
			System.out.println(Utils.getTime() + " 연결 실패!");
		}

	}

}
