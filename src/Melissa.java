import javax.swing.JOptionPane;

public class Melissa {
	int myage = 14;
	String myMonth = "December";
	String name = "Melissa";

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Melissa me = new Melissa();
		System.out.println(me.compareAge(40));
		System.out.println(me.isMyBirthMonth("december"));
		System.out.println(me.isMyBirthMonth("february"));

		JOptionPane.showMessageDialog(null, "Hello its me " + me.getName());
		String userage = JOptionPane.showInputDialog("how old are you?");
		int age = Integer.parseInt(userage);
		int difference = me.compareAge(age);
		String output = getsUsersInfo(difference);
		JOptionPane.showInputDialog("oh i'm " + output);

		JOptionPane.showMessageDialog(null, "my Birthday is on the 8th of " + me.getMyMonth());
		String usersMonth = JOptionPane.showInputDialog("When is your birthday?");

	}

	public String getMyMonth() {
		return myMonth;
	}

	private static String getsUsersInfo(int difference) {
		String output = "";
		if (difference == 0) {
			output = "the same age as you!!twinn jk im more awesomer!!!! ";
		} else if (difference < 0) {
			output = -difference + " years older than you";
		} else {
			output = difference + " years younger than you";

		}
		return output;
	}

	int compareAge(int anotherage) {
		return anotherage - myage;

	}

	boolean isMyBirthMonth(String aMonth) {
		if (myMonth.equalsIgnoreCase(aMonth)) {
			return true;
		} else
			return false;

	}
}