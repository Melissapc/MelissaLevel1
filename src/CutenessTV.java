import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV show = new CutenessTV();
		show.CutenessTV();

	}

	JButton video1 = new JButton();
	JButton video2 = new JButton();
	JButton video3 = new JButton();
	JButton random = new JButton();

	public void CutenessTV() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		video1.addActionListener(this);

		video2.addActionListener(this);

		video3.addActionListener(this);
		random.addActionListener(this);
		video1.setText("ducks");
		video2.setText("frog ");
		video3.setText("unicorn");
		random.setText("random");
		panel.add(video1);
		panel.add(video2);
		panel.add(video3);
		panel.add(random);

		frame.pack();

	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == video1) {
			showDucks();
		}
		if (e.getSource() == video2) {
			showFrog();

		}
		if (e.getSource() == video3) {
			showFluffyUnicorns();

		}
		Random rand = new Random();

		if (e.getSource() == random) {

			int n = rand.nextInt(3) + 1;
			System.out.println("random");
			System.out.println(n);
			if (n == 1) {
				showDucks();
			}
			if (n == 2) {
				showFrog();
			} else if (n == 3) {

				showFluffyUnicorns();
			}

		}
	}

}
