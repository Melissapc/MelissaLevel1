// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/* A basic version of Aaron's scary maze game
 * http://buildsomethingawesome.org/blog/2012/10/27/scary-maze-game/ */

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	ScaryMaze() throws Exception {
		// 1. make a maze image, put it with your Java class
		// http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("scarymaze.png"));
		// 2. set the mouse pointer to the start of your maze using:
		new Robot().mouseMove(0, 0);

		// 3. add a mouse motion listener using:
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		// 4. print the mouseColor variable to see what color the mouse is
		// touching
		System.out.println(mouseColor);
		// 5. make a variable to hold the path color.
		int path = -14605532;
		int background = -15217178;
		// 6. if the mouse falls off the path
		if (mouseColor == background) {
			scare();

		}
		// call the scare method

	}

	private void scare() {
		System.out.println("BOO!");
		// 7. find a scary sound and put it in the default package with your
		// maze picture. look on freesound.org. it can’t be an mp3.

		AudioClip sound = JApplet.newAudioClip(getClass().getResource(
				"scarymazesound.wav"));
		// 8. play the scary sound
		sound.play();
		// 9. use the showScaryImage method to scare your victim!
		showScaryImage("scary.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		// TODO Auto-generated method stub

	}

}
