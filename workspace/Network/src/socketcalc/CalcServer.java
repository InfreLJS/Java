package socketcalc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		ServerSocket serverSocket = null;
		Socket socket;
		InputStream in;
		OutputStream out;
		ObjectInputStream ois;
		ObjectOutputStream oos;

		try {
			serverSocket = new ServerSocket(SocketConfig.PORT_NO);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + " 연결 요청을 기다립니다.");
				socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 가 연결되었습니다.");

				CalcSet set;
				in = socket.getInputStream();
				out = socket.getOutputStream();
				ois = new ObjectInputStream(in);
				oos = new ObjectOutputStream(out);

				while (true) {
					set = (CalcSet) ois.readObject();
					System.out.println(getTime() + " CalcSet 데이터를 전송받았습니다.");
					set.error = true;

					if (set.op == '!')
						break;
					switch (set.op) {
					case '+':
						set.result = set.firstNum + set.secondNum;
						set.error = false;
						break;
					case '-':
						set.result = set.firstNum - set.secondNum;
						set.error = false;
						break;
					case '*':
						set.result = set.firstNum * set.secondNum;
						set.error = false;
						break;
					case '/':
						if (set.secondNum == 0) {
							set.error = true;
							break;
						}
						set.result = set.firstNum / (double) set.secondNum;
						set.error = false;
						break;
					}

					oos.writeObject(set);
					oos.flush();
					System.out.println(getTime() + " 계산 후 CalcSet 데이터를 전송했습니다.");
				}

				ois.close();
				oos.close();
				in.close();
				out.close();
				socket.close();
			} catch (EOFException e) {
				System.out.println(getTime() + " 연결이 끊어졌습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
