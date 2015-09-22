import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Keyboard implements KeyListener {
	public static void main(String[] args) {
		Keyboard sensitive = new Keyboard();

	}

	Keyboard() {

		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setSize(400, 300);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.addKeyListener(this);
		frame.add(panel);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		speak("ouch your so mean!");
	}
}