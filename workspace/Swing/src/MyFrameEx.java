import javax.swing.JFrame;

public class MyFrameEx {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}

@SuppressWarnings("serial")
class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}