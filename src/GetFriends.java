import javax.swing.JOptionPane;

public class GetFriends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate Toby = new Classmate();
		Classmate drew = new Classmate();
		Classmate sherlin = new Classmate();
		Classmate joey = new Classmate();
		Classmate kanvar = new Classmate();
		// 4. set descriptions for each Classmate
		kanvar.setClassmate("11 year old that is funny");
		joey.setClassmate("smart");
		sherlin.setClassmate("fast typer");
		drew.setClassmate("helpful");
		Toby.setClassmate("funny");

		// 5. Use your getter to print out each description
		JOptionPane.showMessageDialog(null, Toby.getClassMate());
		JOptionPane.showMessageDialog(null, kanvar.getClassMate());
		JOptionPane.showMessageDialog(null, sherlin.getClassMate());
		JOptionPane.showMessageDialog(null, drew.getClassMate());
		JOptionPane.showMessageDialog(null, joey.getClassMate());
	}

}

class Classmate {
	String description;

	// 1. create a setter that sets a description for this person
	public void setClassmate(String description) {
		this.description = description;
	}

	// 2. create a getter that gets a description of this person
	String getClassMate() {
		return description;
	}
}
