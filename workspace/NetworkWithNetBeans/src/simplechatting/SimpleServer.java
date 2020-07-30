package simplechatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(SocketConfig.PORT_NO);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + " 연결 요청을 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 가 연결되었습니다.");

				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				DataInputStream dis = new DataInputStream(in);
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("[Notice] Test Message From Server");
				System.out.println(getTime() + " 데이터를 전송했습니다.");

				System.out.println("클라이언트로부터 받은 메시지 : " + dis.readUTF());

				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
