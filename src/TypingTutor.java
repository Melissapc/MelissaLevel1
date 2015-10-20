import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();

	char currentLetter;
	JLabel currentLetterLabel;

	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();

	}

	TypingTutor() {

		frame.setVisible(true);
		frame.setTitle("type or die!");
		currentLetterLabel = new JLabel();
		frame.add(currentLetterLabel);
		currentLetterLabel.setFont(currentLetterLabel.getFont().deriveFont(
				28.0f));
		currentLetterLabel.setHorizontalAlignment(JLabel.CENTER);
		changeletter(generateRandomLetter());
		frame.addKeyListener(this);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	void changeletter(char letter) {
		currentLetterLabel.setText("" + letter);
		currentLetter = letter;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			frame.setBackground(Color.GREEN);
			frame.setForeground(Color.GREEN);
			currentLetterLabel.setBackground(Color.GREEN);
			currentLetterLabel.setForeground(Color.GREEN);

		} else {

			System.out.println("incorrect");
			frame.setBackground(Color.RED);
			frame.setForeground(Color.RED);
			currentLetterLabel.setBackground(Color.RED);
			currentLetterLabel.setForeground(Color.RED);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char letter = generateRandomLetter();
		changeletter(letter);

	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date(numberOfCorrectCharactersTyped);
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is "
				+ charactersPerMinute + " characters per minute.");
	}

	Date timeAtStart = new Date(currentLetter);

}
