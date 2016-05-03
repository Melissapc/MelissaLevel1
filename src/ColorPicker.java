import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorPicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextField box = new JTextField();

	public static void main(String[] args) {
		ColorPicker color = new ColorPicker();

	}

	ColorPicker() {

		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.add(panel);
		button1.setText("blue");
		button2.setText("red");
		button3.setText("green");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(label);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(box);
		box.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button1) {
			label.setText("you chose blue");
			label.setForeground(Color.blue);
		}
		if (e.getSource() == button2) {
			label.setText("you chose red");
			label.setForeground(Color.red);
		}
		if (e.getSource() == button3) {
			label.setText("you chose green");
			label.setForeground(Color.green);

		}
		label.setFont(new Font("helvetica", 0, 16));
	}

}
