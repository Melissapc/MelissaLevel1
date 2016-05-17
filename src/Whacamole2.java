import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whacamole2 {
	public static void main(String[] args) {
		Whacamole2 wm = new Whacamole2();

	}

	Whacamole2() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(700, 700);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.add(frame);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		b1.add(frame);
		b2.add(frame);
		b3.add(frame);
		b4.add(frame);
		b5.add(frame);
		b6.add(frame);

	}
}
