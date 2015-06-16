import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Melissabuttons {
public static void main(String[] args) {
JPanel buttons = new JPanel();
JFrame names = new JFrame();
names.setVisible(true);
JButton girls = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
buttons.add(girls);
names.add(buttons);
buttons.add(button2);
buttons.add(button3);
buttons.add(button4);
girls.setText("sherlin");
button2.setText("Melissa");
button3.setText("Lauren");
button4.setText("Emi");


}
}
