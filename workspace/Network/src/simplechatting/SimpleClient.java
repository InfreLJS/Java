package simplechatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			System.out.println("서버에 연결 중입니다. 서버 IP : " + SocketConfig.SERVER_IP);
			Socket socket = new Socket(SocketConfig.SERVER_IP, SocketConfig.PORT_NO);
			InputStream is = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(out);

			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());

			dos.writeUTF("echo");
			System.out.println(getTime() + " 데이터를 전송했습니다.");

			System.out.println("연결을 종료합니다.");

			dis.close();
			socket.close();
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
