import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary2 implements ActionListener {
	JFrame frame = new JFrame();
	JTextField input = new JTextField(20);
	JTextField output = new JTextField(20);
	JPanel panel = new JPanel();
	JButton button = new JButton("convert");

	public static void main(String[] args) {
		Binary2 lol = new Binary2();
	}

	Binary2() {
		frame.setVisible(true);
		button.addActionListener(this);
		frame.add(panel);
		panel.add(input);
		panel.add(button);
		panel.add(output);
		frame.pack();

	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, dummy!!!");
			return 0;
		}
		if (!Pattern.matches("[01]{8}", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = input.getText();
		int binary = convert(text);
		output.setText("" + binary);
	}

	String convert2(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}
}