import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton playbutton = new JButton();

	int randoma;
	int randomb;
	int randomc;

	int y = 1000;
	int w = 3000;
	int z = 6000;

	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();

	}

	SlotMachine() {
		frame1 = new JFrame();

		panel1 = new JPanel();
		playbutton = new JButton();
		label2 = new JLabel();
		label3 = new JLabel();
		label1 = new JLabel();
		label1.setFont(label1.getFont().deriveFont(30.0f));
		label2.setFont(label1.getFont().deriveFont(30.0f));
		label3.setFont(label1.getFont().deriveFont(30.0f));
		playbutton.setFont(label1.getFont().deriveFont(30.0f));
		frame1.add(panel1);
		panel1.add(playbutton);
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label1);
		frame1.setVisible(true);
		frame1.setSize(600, 400);
		playbutton.setText("PlAY!!!");
		playbutton.addActionListener(this);

		spinwheel(1);
		spinwheel(2);
		spinwheel(3);
		frame1.pack();
	}

	void spinwheel(int wheel) {
		Random r = new Random();
		int numbers = (r.nextInt(10));
		if (wheel == 1) {
			label1.setText("" + numbers);
		}
		if (wheel == 2) {
			label2.setText("" + numbers);
		} else if (wheel == 3) {
			label3.setText("" + numbers);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		spinwheel(1);
		spinwheel(2);
		spinwheel(3);
	}
}
