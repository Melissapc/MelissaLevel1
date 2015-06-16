import java.awt.Component;

import javax.swing.JOptionPane;

public class Methodorama {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("type in a persons name");
		truth(name);

	}

	public static void iRock(String Name) {
		System.out.println("melissa iRocks");
	}

	public static void rocker(String name) {
		System.out.println(name + " rocks");
	}

	public static void truth(String names) {

		if (names.equals("melissa")) {
			System.out.print(names + " is awesome!!");
		}

		if (names.equals("justin bieber")) {

			System.out.println(names + " is annoying!!");
		}

	}
}
