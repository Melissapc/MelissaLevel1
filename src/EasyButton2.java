import java.awt.event.MouseAdapter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyButton2 extends MouseAdapter {

	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */
public static void main(String[] args) {
	EasyButton2 eazy = new EasyButton2();
	eazy.showEasyButton();
	eazy.speak("sup");
}
	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"https://lh3.ggpht.com/K5g3GuzDZFSNqQnZ_tLo9tMPc3fDuWHfY_eiYIIHLYeIGF1etT8741wigPlAFwtVSm8=w300");
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
