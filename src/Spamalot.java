import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	public static void main(String[] args) {
		Spamalot spam = new Spamalot();
		spam.Spam();

	}

	JButton bad = new JButton();
	JButton good = new JButton();
	JTextField text = new JTextField(13);

	public void Spam() {
		JFrame frame = new JFrame();
		frame.setSize(400, 90);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(bad);
		panel.add(good);
		bad.setText("BAD");
		good.setText("GOOD");
		bad.addActionListener(this);
		good.addActionListener(this);
		text.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
