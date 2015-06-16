import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortunecookie implements ActionListener {
	JButton fortune = new JButton("fortune cookie");

	public void method() {
		JFrame cookieframe = new JFrame();
		fortune.setText("get your fortune");

		cookieframe.add(fortune);
		fortune.addActionListener(this);
		cookieframe.setVisible(true);

	}

	public static void main(String[] args)

	{
		new Fortunecookie().method();
		;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String number = JOptionPane.showInputDialog("put in a number 1-5");

		if (number.equals("1")) {
			JOptionPane.showMessageDialog(null, "no money");
		}
		if (number.equals("2")) {
			JOptionPane.showMessageDialog(null, "sorry");
		}
		if (number.equals("3")) {
			JOptionPane.showMessageDialog(null, "one more shot");

			number = JOptionPane.showInputDialog("1-5");
		}
		if (number.equals("4"))
			JOptionPane.showMessageDialog(null, "last shot!((-:");
		if (number.equals("5")) {
			JOptionPane.showInputDialog(null, "yess you win money");
		}
		// TODO Auto-generated method stub

	}
}
