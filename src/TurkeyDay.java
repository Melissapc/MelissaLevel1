import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TurkeyDay implements MouseListener

{

	private static final JLabel mouseClicked = null;
	JLabel turkeyImage;

	public static void main(String[] args) {

		TurkeyDay td = new TurkeyDay();
		try {
			td.createImage("cool.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			td.playSound("gobble.wav");
		}
	}

	TurkeyDay() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 600);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.addMouseListener(this);
		try {
			turkeyImage = createImage("cool.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(turkeyImage);

		frame.pack();
	}

	private JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("gobble.wav"));
		sound.play();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		System.out.println("The turkey was clicked ");
		turkeyImage.show();
		playSound("gobble.wav");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}