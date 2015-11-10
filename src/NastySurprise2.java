import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise2 implements ActionListener {
	public static void main(String[] args) {
		NastySurprise2 ew = new NastySurprise2();

	}

	JButton j = new JButton();
	JButton j2 = new JButton();
	String treat = "https://halloweencostumesatcompletelybonkers.files.wordpress.com/2012/07/3259.jpg";
	String trick = "http://www.hd-wallpapersdownload.com/upload/bulk-upload/desktop-hd-images-of-a-cute-puppy-dog.jpg";

	NastySurprise2() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);

		j.setVisible(true);
		j2.setVisible(true);
		panel.add(j2);
		panel.add(j);
		frame.pack();
		j.setText("trick");
		j2.setText("treat");
		j.addActionListener(this);
		j2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == j2) {
			this.showPictureFromTheInternet(treat);
		} else {
			this.showPictureFromTheInternet(trick);
		}
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

}
