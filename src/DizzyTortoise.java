import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
 DizzyTortoise dizzy = new DizzyTortoise();
String ok = JOptionPane.showInputDialog("how dizzy do u want the tortoise to spin from 1-10? ");
 int x;
 x= Integer.parseInt(ok);
 dance(x);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
/*
 * 1. Use the dance method to make the Tortoise spin.

 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
 * that number of times.
 */