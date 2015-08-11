import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie2 implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie2 cookie = new FortuneCookie2();
		cookie.ShowButton();
	}

	public void ShowButton() {
		System.out.println("showButton");
		JFrame frame = new JFrame();
		
		frame.setSize(300, 250);
		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		int number = new Random().nextInt(5);

		if (number == 1) {
			JOptionPane.showMessageDialog(null,"you will win 1 million dollars in cashhh!");
		}

		if (number == 2) {
			JOptionPane.showMessageDialog(null, "you will loose your teeth!");
		}
		if (number == 3) {
			JOptionPane.showMessageDialog(null,"you will meet A FAMOUSE ACTOR!");
		}

		if (number == 4) {
			JOptionPane.showMessageDialog(null,"you do not have to worry about your future(:'");
		}
		if (number == 5) {
			JOptionPane.showMessageDialog(null,"your life will be stable and be livving happy!");
		}
	}
}
