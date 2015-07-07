import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

	Calculator() {
		JFrame jframe = new JFrame();
		jframe.setSize(600, 600);
		jframe.setVisible(true);

		JLabel label = new JLabel();
		JTextField number1 = new JTextField(4);

		JTextField number2 = new JTextField(4);
		JTextField answer = new JTextField(4);

		JPanel jpanel = new JPanel();
		jpanel.add(number1);
		jpanel.add(number2);
		jpanel.add(answer);

		jpanel.setVisible(true);

		JButton multiply = new JButton();
		jpanel.add(multiply);
		multiply.setText("multiply");

		JButton divide = new JButton();
		jpanel.add(divide);
		divide.setText("divide");

		JButton add = new JButton();
		jpanel.add(add);
		add.setText("add");

		JButton subtract = new JButton();
		jpanel.add(subtract);
		subtract.setText("subtract");
		jframe.add(jpanel);
		jframe.pack();
	}
}
