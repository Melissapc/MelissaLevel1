import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObediantTortoise {
	public static void main(String[] args) {
		String shapeanswer = JOptionPane.showInputDialog(null, "what shape do you want: Square,Triangle,or a circle?");
		String coloranswer = JOptionPane.showInputDialog(null, "which color do u want for your shape?");
		if (coloranswer.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		if (shapeanswer.equals("circle")) {
			drawCircle();
		}
		if (shapeanswer.equals("square")) {
			drawSquare();
		}

		if (shapeanswer.equals("triangle")) {
			drawTriangle();
		} // drawSquare();
			// drawTriangle();
			// drawCircle();

	}

	private static void drawCircle() {
		Tortoise.show();
		for (int i = 0; i < 360; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(2);

			Tortoise.turn(1);
		}
	}

	private static void drawTriangle() {
		Tortoise.show();
		for (int i = 0; i < 3; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(50);
			Tortoise.turn(180 - (180 / 3));
		}
	}

	private static void drawSquare() {
		Tortoise.show();
		for (int i = 0; i < 4; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(70);
			Tortoise.turn(90);

		}
	}
}
