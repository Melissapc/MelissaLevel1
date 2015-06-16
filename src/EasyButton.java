import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyButton extends MouseAdapter {
	public static void main(String[] args) {

		EasyButton button = new EasyButton();
		button.showEasyButton();

	}

	public void MouseClicked(MouseEvent e) {
		System.out.println("okk");
		speak("never quitttt");

	}

	EasyButton() {
		showEasyButton();

	}

	JLabel easyButtonImage;

	/*
	 * Use the methods below to make an easy button show on the screen. When
	 * clicked, it says some very annoying words.
	 */

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.addMouseListener(this);
		URL url = null;
		try {
			url = new URL(
					"https://github.com/joonspoon/league-jars/blob/master/easy_button.jpg?raw=true");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
