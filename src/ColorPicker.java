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
	int question;

	public static void main(String[] args) {
		ColorPicker color = new ColorPicker();
		TextOption c = new TextOption(option1, option2, option3);
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
		if (question == 0) {
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
			button1.setText("small");
			button2.setText("medium");
			button3.setText("big");

		}

		if (question == 1) {
			int textsize = 0;

			if (e.getSource() == button1) {
				textsize = 10;
				button1.setText("small");
			}
			if (e.getSource() == button2) {
				textsize = 15;
				button2.setText("medium");
			}
			if (e.getSource() == button3) {
				textsize = 40;
				button3.setText("big");
			}
			label.setOpaque(true);

			button1.setOpaque(true);
			button2.setOpaque(true);
			button3.setOpaque(true);
			button1.setBackground(Color.pink);
			button2.setBackground(Color.cyan);
			button3.setBackground(Color.magenta);
			label.setFont(new Font("helvetica", Font.PLAIN, textsize));
		}

		if (question == 2) {
			if (e.getSource() == button1) {
				label.setText("pink");
				label.setOpaque(true);
				label.setBackground(Color.pink);
			}
			if (e.getSource() == button2) {
				label.setText("cyan");
				label.setOpaque(true);
				label.setBackground(Color.cyan);
			}
			if (e.getSource() == button3) {
				label.setText("magenta");
				label.setOpaque(true);
				label.setBackground(Color.magenta);
			}
		}
		question++;

	}
}
