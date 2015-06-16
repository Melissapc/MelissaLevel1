// Copyright The League of Amazing Programmers, 2015
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements ActionListener {
	Song gerald = new Song("G-Eazy - Let's Get Lost.mp3");
	Song geazy = new Song("Fall Out Boy - Centuries.mp3");
	Song sd = new Song("Maroon 5 - Sugar.mp3");
	Song rad = new Song("G-Eazy Far Alone.mp3");
	Song perfect = new Song("G-Eazy - Marilyn.mp3");
	
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	
	JButton stopper = new JButton();

	public static void main(String[] args) throws IOException,

	JavaLayerException {
		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song

		Jukebox favv = new Jukebox();
		// 5. Play the Song
		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
	}

	Jukebox() {
		JFrame frame = new JFrame("Jukebox");
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		button.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);
		stopper.setVisible(true);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		stopper.addActionListener(this);
		

		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(stopper);
		button.setText("lets get lost");
		button1.setText("CENTURIES");
		button2.setText("SUGAR");
		button3.setText("far alone");
		stopper.setText("stop");
	}

	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == button) {
			gerald.play();

		}

		if (arg0.getSource() == button1) {
			geazy.play();
		}

		if (arg0.getSource() == button2) {
			sd.play();
		}

		if (arg0.getSource() == button3) {
			rad.play();
		}

		if (arg0.getSource() == button4) {
			perfect.play();

		}

		if (arg0.getSource() == stopper) {
			rad.stop();
			sd.stop();
			geazy.stop();
			gerald.stop();
			perfect.stop();
		}

	}
}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}
