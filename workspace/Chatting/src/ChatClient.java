import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {
	int port = 10001;

	@SuppressWarnings({ "unused", "resource" })
	public ChatClient(String server) throws Exception {
		Socket socket = new Socket(server, port);
		InputStream input = socket.getInputStream();
		OutputStream output = socket.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�� ���� ��ȣ �Է� : ");
		int selRoom = br.read();

	}

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		ChatClient client = new ChatClient("10.156.145.154");
	}
}