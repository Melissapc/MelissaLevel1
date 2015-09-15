// Copyright The League of Amazing Programmers, 2015
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

public class Jukebox2 implements ActionListener {
	JButton song1 = new JButton();
	JButton song2 = new JButton();
	JButton song3 = new JButton();
	Song fav = new Song("Justin Bieber - What Do You Mean- (Lyric Video).mp3");
	Song cheer = new Song(
			"OMI - Cheerleader (Felix Jaehn Remix) [Official Video].mp3");
	Song bb = new Song("alt-J (-) Breezeblocks.mp3");

	public static void main(String[] args) throws IOException,
			JavaLayerException {
		Jukebox2 juke = new Jukebox2();
		juke.createUI();

		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song

		// 5. Play the Song

	}

	void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		song1.addActionListener(this);

		JLabel image1 = loadImage("jbbb.jpeg");

		song1.setText("WDYM");
		panel.add(song1);

		song2.addActionListener(this);
		JLabel image2 = loadImage("cheer.jpeg");

		song2.setText("CHEERLEADER");
		panel.add(song2);

		JLabel image3 = loadImage("bbb.jpeg");

		song3.setText("Breezeblocks!");
		song3.addActionListener(this);
		panel.add(song3);
		frame.pack();
	}

	/*
	 * 6. Create a user interface for your Jukebox so that the user can to
	 * choose which song to play. You can use can use a different button for
	 * each song, or a picture of the album cover. When the button or album
	 * cover is clicked, stop the currently playing song, and play the one that
	 * was selected. dfvndjvnfdjbv
	 */

	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (song1 == e.getSource()) {
			cheer.stop();
			bb.stop();
			fav.play();
		}

		if (song2 == e.getSource()) {
			fav.stop();
			bb.stop();
			cheer.play();
		}
		if (song3 == e.getSource()) {
			cheer.stop();
			fav.stop();
			bb.play();
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
}
