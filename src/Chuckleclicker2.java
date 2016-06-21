import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckleclicker2 implements ActionListener {
	public static void main(String[] args) {
		Chuckleclicker2 chuck = new Chuckleclicker2();
		chuck.makeButtons();
	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
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
		button4.setText("punchline");
		button1.setFont(button1.getFont().deriveFont(20.0f));
		button2.setFont(button2.getFont().deriveFont(20.0f));
		button3.setFont(button1.getFont().deriveFont(20.0f));
		button4.setFont(button2.getFont().deriveFont(20.0f));
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Did you hear about the guy whose whole left side was cut off?");
		}
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, " He's all right now.");
		}
		if (e.getSource() == button3) {
			JOptionPane.showMessageDialog(null, " what do you.");
		}
	}
}
