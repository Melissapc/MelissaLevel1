import javax.swing.JOptionPane;

public class WritingMethods {
	public static void main(String[] args) {

		WritingMethods v = new WritingMethods();
		v.iRock();
		v.rocker("bob");
		v.truth("JUSTIN BIEBER!!!");
		v.truth("areli");
		v.echo("happy");
		v.repeat("hey", 5);
		String coder = v.getTheBestCoder();
		System.out.println("the best coder is " + coder);
		int sum = v.add(8, 2);
		System.out.println(sum);
	}

	void iRock() {
		String name1 = "june";
		System.out.println(name1 + " " + "rocks");
	}

	void rocker(String name) {

		System.out.println(name + " rocks");
	}

	void truth(String name) {
		// JOptionPane.showMessageDialog(null, "type a singers name");
		if (name.equalsIgnoreCase("Justin bieber")) {
			System.out.println(name + " sucks");
		} else {
			System.out.println(name + " is awesome");
		}

	}

	void echo(String word) {
		for (int i = 0; i < 2; i++) {
			System.out.println("happy");
		}
	}

	void repeat(String word, int times) {
		for (int i = 0; i < 5; i++) {
			System.out.println("hey");

		}
	}

	String getTheBestCoder() {
		String theBest = "melissa!!!";

		return theBest;

	}

	int add(int number1, int number2) {
		int sum = (number1 + number2);
		return 8 + 2;

	}
}
