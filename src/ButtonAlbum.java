import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class ButtonAlbum implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JPanel panel = new JPanel();
   
	/* We’re going to make Buttons that show cool Pictures */

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	// 5. create two variables of type "JLabel" but don’t initialize them
	JLabel label;
	JLabel label2;

	private void makeAlbum() {
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. find 2 images and save them to your disk
		// 4. make a variable. make it hold the location of your image. e.g.
		// “illusion.jpg”
		String image = "laguna.jpg";
		String image2 = "sd.jpg";
		// 6. use one of the the "loadImage..." methods below to initialize your
		// JLabel
		label=loadImageFromComputer(image);
		label2=loadImageFromComputer(image2);
		// 7. add a action listener ("this") to your Right Button and set the
		// Text of your button
		rightButton.addActionListener(this);
		rightButton.setText("laguna 2");
		// 8. add an action Listener (“this”) to the Left Button and set the
		// Text of your button
		leftButton.addActionListener(this);
		leftButton.setText("sandiego 1");
		// 9. Add the leftButton to the panel
		panel.add(leftButton);
		// 10. Add the rightButton to the panel
		panel.add(rightButton);
		// 11. add the Panel to the JFrame
		frame.add(panel);
		// 12. Pack the Frame
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		// 13. remove both labels from the frame
		if(buttonPressed==rightButton){
			frame.remove(label);
			frame.remove(label2);
			
			frame.add(label);
			frame.pack();
		}
		
		// 14. load one label to the JFrame
		
		// 15. pack the frame
		/* If the buttonPressed was the rightButton.... */
		if(buttonPressed==leftButton){
			frame.remove(label);
			frame.remove(label2);
			
			frame.add(label2);
			frame.pack();
		}
		
		/* If the buttonPressed was the rightButton.... */
		// 16. remove both labels from the frame
		// 17. load other label to the JFrame
		// 18. pack the frame
	}

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new ButtonAlbum().makeAlbum();
	}
}
