import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 10001;

		try {
			serverSocket = new ServerSocket(port);
			System.out.println(getTime() + " 서버가 준비되었습니다.");

			Socket socket = serverSocket.accept();
			InetAddress clientAddress = socket.getInetAddress();
			System.out.println(getTime() + clientAddress + " 에서 클라이언트가 접속했습니다.");

			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String recvStr = null;
			while ((recvStr = br.readLine()) != null) {
				System.out.println(getTime() + " 클라이언트로부터 받은 문자열 : " + recvStr);
				pw.println(recvStr);
				pw.flush();
			}

			pw.close();
			br.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
