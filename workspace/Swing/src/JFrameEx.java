import javax.swing.JFrame;

public class JFrameEx {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JFrame");
		jf.setSize(300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
