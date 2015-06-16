import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JComponents implements ActionListener{

public JComponents (){
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JLabel jlabel = new JLabel();
	JTextField jtextfield = new JTextField();
	JButton jbutton = new JButton();
	
	jlabel.setText("Question:");
	jtextfield.setText("");
	String s = jtextfield.getText();
	System.out.print(s);
	jbutton.setText("ok");
	

	jbutton.addActionListener(this);
	
	jpanel.setBounds(100, 100, 100, 100);
	jpanel.add(jlabel);
	jpanel.add(jtextfield);
	jpanel.add(jbutton);
	jframe.add(jpanel);
	jframe.setVisible(true);
	
	
}
public static void main(String[] args) {
	
	JComponents j = new JComponents();
	

	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}

