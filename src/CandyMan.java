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

public class CandyMan implements ActionListener {
	int timespressed = 1;

	public static void main(String[] args) {
		CandyMan cm = new CandyMan();

	}

	CandyMan() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		JButton button = new JButton();
		button.addActionListener(this);
		frame.add(button);
		button.setText("CandyMan");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(timespressed);
		timespressed++;
		if (timespressed % 5 == 0) {
			showPictureFromTheInternet("https://lizjakes.files.wordpress.com/2011/11/hallows6.jpg");
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
