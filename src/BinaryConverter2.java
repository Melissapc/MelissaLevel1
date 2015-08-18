import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter2 implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter2 binary = new BinaryConverter2();
	}

	JTextField answer = new JTextField(20);
	JTextField answer2 = new JTextField(20);

	JButton convert = new JButton();

	BinaryConverter2() {
		JFrame frame = new JFrame("let me show you binary! awesome person!!!");

		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		convert.addActionListener(this);
		convert.setText("convert");
		panel.add(answer);
		panel.add(convert);
		panel.add(answer2);
		frame.pack();

	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		/*
		 * if(!Pattern.matches("\2", binary)) {
		 * JOptionPane.showMessageDialog(null,
		 * "Binary can only contain 1s or 0s, silly!!!"); return 0; }
		 */
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

		String getbinary = answer.getText();
		int number = convert(getbinary);
		String ok=""+number;
		answer2.setText(ok);

	}

}
