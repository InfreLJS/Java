import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer implements Runnable {
	ServerSocket serverSocket = null;
	int port = 10001;
	int count;

	public ChatServer() throws IOException {
		serverSocket = new ServerSocket(port);
		count = 0;
	}

	@SuppressWarnings("unused")
	public void run() {
		try {
			Socket conn;
			InputStream input1;
			OutputStream output2;

			System.out.println("ChatServer���� ���ο� ������ ��ٸ��� ��...");
			while (true) {
				conn = serverSocket.accept();
				count++;
				input1 = conn.getInputStream();
				System.out.println("Client ����.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			ChatServer cs = new ChatServer();
			new Thread(cs).start();
		} catch (IOException e) {
			System.out.println("������ ������ �� ����.");
		}
	}
}