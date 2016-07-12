import javax.swing.JOptionPane;

public class TeaParty {
	String w;

	public static void main(String[] args) {
		TeaParty tea = new TeaParty();
		String result;

		result = tea.welcome("Curiel", true, true);
		JOptionPane.showMessageDialog(null, result);

		result = tea.welcome("Newton", true, false);
		JOptionPane.showMessageDialog(null, result);

		result = tea.welcome("Orwell", false, true);
		JOptionPane.showMessageDialog(null, result);

		result = tea.welcome("Austen ", true, true);
		JOptionPane.showMessageDialog(null, result);

	}

	public String welcome(String lastName, boolean isWoman, boolean isKnighted) {
		if (isKnighted == false && isWoman == true) {
			w = "Hello Miss " + lastName;
		}
		if (isKnighted == true && isWoman == true) {
			w = "Hello Mr " + lastName;
		}

		if (isKnighted == true && isWoman == false) {
			w = "Hello Sir " + lastName;
		}

		if (isKnighted == true && isWoman == true) {
			w = " Hello Dame " + lastName;

		}
		return w;
	}

}
