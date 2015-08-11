import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.showButton();

	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		panel.add(button1);

		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setText("joke");
		button2.setText("punchline");
		button3.setText("joke");
		button3.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null,"Did you hear about the guy whose whole left side was cut off?");
		}

		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, " He's all right now.");
		}
		if (e.getSource() == button3) {
			JOptionPane.showMessageDialog(null,	"to be continued (3,4)");
		}
	}
}
