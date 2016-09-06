import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	public static void main(String[] args) {
		ColorTeacher color = new ColorTeacher();
		color.ColorTeacher();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public void ColorTeacher() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(200, 250);
		frame.setTitle("Color Teacher");
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);

		yellow.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);

		red.addActionListener(this);
		red.setBackground(Color.RED);
		red.setOpaque(true);

		blue.addActionListener(this);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);

		green.addActionListener(this);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);

		frame.pack();
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
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == yellow) {
			speak("yellow");
		}
		if (buttonPressed == red) {
			speak("red");
		}
		if (buttonPressed == blue) {
			speak("blue");

		}
		if (buttonPressed == green) {
			speak("green");
		}
	}

}