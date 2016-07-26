import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JButton clear = new JButton();
	String test = "3";
	JTextField number1 = new JTextField(4);
	JTextField number2 = new JTextField(4);

	Calculator() {

		JFrame jframe = new JFrame();
		jframe.setSize(600, 600);
		jframe.setVisible(true);

		JLabel answer = new JLabel(test);

		JPanel jpanel = new JPanel();
		jpanel.add(number1);
		jpanel.add(number2);

		jpanel.setVisible(true);

		multiply.addActionListener(this);
		jpanel.add(multiply);
		multiply.setText("multiply");

		divide.addActionListener(this);
		jpanel.add(divide);
		divide.setText("divide");

		add.addActionListener(this);
		jpanel.add(add);
		add.setText("add");

		subtract.addActionListener(this);
		jpanel.add(subtract);
		subtract.setText("subtract");
		jframe.add(jpanel);
		jpanel.add(answer);
		jframe.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == multiply) {
			calculator2.multiply(8, 8);
		}
	}
}
