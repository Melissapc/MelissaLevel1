import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);

		// 2. Make the frame visible
		frame.setVisible(true);
		middleButton.setText("Click me");
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("click me");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("click me");
		// 5. Add an action listener to the leftButton
		middleButton.addActionListener(this);
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);

		// 7. Add the leftButton to the panel

		panel.add(leftButton);
		panel.add(middleButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		if (buttonPressed == leftButton) {
			middleButton.setText("Click me!");
			rightButton.setText("NO, click Me");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("click me");
			leftButton.setPreferredSize(SMALL);
			middleButton.setPreferredSize(BIG);
		}

		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */
		if (buttonPressed == rightButton) {
			middleButton.setText("click me");
			leftButton.setText("click Me");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("click me");
			rightButton.setPreferredSize(SMALL);
			middleButton.setPreferredSize(BIG);
		}

		if (buttonPressed == middleButton) {
			middleButton.setText("click me");
			leftButton.setText("Click Me");
			middleButton.setPreferredSize(SMALL);
			leftButton.setPreferredSize(BIG);
			rightButton.setText("click me");
			rightButton.setPreferredSize(BIG);

		}
		frame.pack();
	}
}
