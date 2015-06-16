import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slothmachine implements ActionListener {
	public static void main(String[] args) {
		Slothmachine sm = new Slothmachine();

	}

	JLabel numberr = new JLabel();
	JLabel numbe2 = new JLabel();
	JLabel number93 = new JLabel();

	int START = 1;
	int END = 10;

	Slothmachine() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setTitle("Sloth machine");
		frame.add(panel);

		numberr.setText("1");
		numbe2.setText("3");
		number93.setText("6");
		Random random = new Random();
		int number = random.nextInt(9);
		int number2 = random.nextInt(8);
		int number3 = random.nextInt(5);

		frame.setSize(500, 500);

		JButton spinner = new JButton();

		spinner.addActionListener(this);

		spinner.setText("SPIN");

		panel.add(spinner);

		panel.add(numberr);
		panel.add(numbe2);
		panel.add(number93);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random randomm = new Random();
		Jtext
		 numberr.setText(""+randomm.nextInt(400000));
	
	}

}
