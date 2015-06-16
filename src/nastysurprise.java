import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
	Button button = new Button("Trick");
	Button button1 = new Button("treat");

	public static void main(String[] args) {
		nastysurprise ewww = new nastysurprise();
		ewww.createUi();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	void createUi() {
		JPanel panel = new JPanel();

		button.setVisible(true);
		panel.add(button);

		button1.setVisible(true);
		panel.add(button1);
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String imageUrl;
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			showPictureFromTheInternet("http://wanderlustandlipstick.com/blogs/wanderlushdiary/files/2012/04/80545124.jpg");
		}
		if (e.getSource() == button1) {
			showPictureFromTheInternet("http://www.normanfaraz.com/wp-content/uploads/cute-puppy-dog-wallpapers-20140502100720-53636e5900eab.jpg");
		}

		// Make a user interface that has 2 buttons. One says “Trick” the other
		// says
		// “Treat”. When the user clicks on the Trick button,
		// show them a picture of a cute puppy.
		// When they click Treat, show them a scary image.
		// To show the pictures, use the showPictureFromTheInternet() method
		// below.

	}
}