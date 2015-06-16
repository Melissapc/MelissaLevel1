import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame = new JFrame();
	Date startimer = new Date();
	int count = 0;
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(24);
		new Whackamole().drawButtons(n);
	}

	public void drawButtons(int randomnumber) {
		JPanel panel = new JPanel();
		frame = new JFrame();
		frame.add(panel);
		frame.setSize(350, 250);
		panel.setVisible(true);
		frame.setVisible(true);
		for (int i = 0; i < 24; i++) {
			JButton button2 = new JButton();
			button2.addActionListener(this);
			button2.setVisible(true);
			panel.add(button2);
			if (randomnumber == i) {
				button2.setText("mole");
			}
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if (((AbstractButton) e.getSource()).getText() != "mole") {
			speak("dork");

		} else {
			frame.dispose();
			Random rand = new Random();
			int n = rand.nextInt(24);
			drawButtons(n);
			count++;
			System.out.println(count);

		}
		if (count == 10) {
			endGame(startimer, 10);
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date(molesWhacked);
		JOptionPane
				.showMessageDialog(
						null,
						"Your whack rate is "
								+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
								+ " moles per second.");

	}
}
