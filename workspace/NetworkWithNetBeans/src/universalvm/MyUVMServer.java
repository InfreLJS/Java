package universalvm;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyUVMServer {

	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket serverSocket = new ServerSocket(SocketConfig.PORT);
				System.out.println(Utils.getTime() + "클라이언트 연결 요청 대기 중...");
				Socket socket = serverSocket.accept();

			} catch (IOException e) {
				System.out.println(Utils.getTime() + "클라이언트 연결 실패!");
			}
		}
	}
}

class MyUVMThread extends Thread {
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;

	public MyUVMThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		while (Thread.currentThread().isInterrupted()) {
			try {
				ois = new ObjectInputStream(socket.getInputStream());
				oos = new ObjectOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println(Utils.getTime() + "쓰레드 생성 실패!");
				this.interrupt();
			}

		}
	}

}