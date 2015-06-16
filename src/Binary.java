import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Binary implements ActionListener {
JTextField jtextfield2 = new JTextField(20);
JTextField jtextfield = new JTextField(20);
public Binary() {
JFrame jframe = new JFrame();
JPanel jpanel = new JPanel();
// JLabel jlabel = new JLabel();
JButton jbutton = new JButton("Convert");
jbutton.addActionListener(this);
jbutton.addActionListener(this);
jpanel.setBounds(100, 100, 100, 100);
// jpanel.add(jlabel);
jpanel.add(jtextfield);
jpanel.add(jbutton);
jpanel.add(jtextfield2);
jframe.add(jpanel);
jframe.setVisible(true);
}
public static void main(String[] args) {
	Binary j = new Binary();
}
public String convertBinaryToText(String binary) {
int asciiValue = Integer.parseInt(binary, 2);
char theLetter = (char) asciiValue;
return "" + theLetter;
}
@Override
public void actionPerformed(ActionEvent e) {
String text = jtextfield.getText();
String binary = convertBinaryToText(text);
jtextfield2.setText(binary);
// TODO Auto-generated method stub
}
}
