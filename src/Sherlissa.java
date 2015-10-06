import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sherlissa implements ActionListener {
	JButton mel = new JButton();
	JButton sher = new JButton();

	public static void main(String[] args) {
		Sherlissa me = new Sherlissa();

	}

	Sherlissa() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(250, 250);
		JPanel panel = new JPanel();
		frame.add(panel);

		mel.addActionListener(this);

		sher.addActionListener(this);
		mel.setVisible(true);
		mel.setText("Melissa");

		sher.setVisible(true);
		sher.setText("sherlin");
		panel.add(mel);
		panel.add(sher);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(mel)) {
			System.out.println("melissa rocks!");

		} else if (e.getSource().equals(sher)) {
			System.out.println("sherlin rocks!");
		}
	}
}
