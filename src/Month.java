import java.util.Random;

import javax.swing.JOptionPane;

public class Month {
	String nameOfMonth;
	int numberOfDays;
	Month nextMonth;
	String season;

	public String getSeason() {
		return season;
	}

	public Month getNextMonth() {
		return nextMonth;
	}

	public void setNextMonth(Month nextMonth) {
		this.nextMonth = nextMonth;
	}

	public static void main(String[] args) {
		Month jan = new Month("january", 31, "winter");
		Month feb = new Month("february", 28, "winter");
		Month mar = new Month("March", 31, "Spring");
		Month april = new Month("april", 30, "spring");
		Month may = new Month("may", 31, "spring");
		Month june = new Month("june", 30, "summer");
		Month july = new Month("july", 31, "summer");
		Month aug = new Month("august", 31, "summer");
		Month sep = new Month("september", 30, "autumn");
		Month oct = new Month("october", 31, "autumn");
		Month nov = new Month("novmeber", 30, "autumn");
		Month dec = new Month("december", 31, "winter");
		jan.setNextMonth(feb);
		feb.setNextMonth(mar);
		mar.setNextMonth(april);
		april.setNextMonth(may);
		may.setNextMonth(june);
		june.setNextMonth(july);
		july.setNextMonth(aug);
		aug.setNextMonth(sep);
		sep.setNextMonth(oct);
		oct.setNextMonth(nov);
		nov.setNextMonth(dec);
		dec.setNextMonth(jan);
		for (int i = 0; i < 12; i++) {
			// askForMonth(jan, feb, mar, april, may, june, july, aug, sep, oct,
			// nov, dec);
		}

		Month month = jan;
		Random r = new Random();

		int number = r.nextInt(12);
		// System.out.println("hint the month is " + number);
		for (int i = 0; i < number; i++) {
			month = month.getNextMonth();

		}
		// System.out.println("hint the month is: " + month.getNameOfMonth());
		System.out.println("i am a month in the season: " + month.getSeason());
		System.out.println("the number of day in this month: " + month.getNumberOfDays());
		System.out.println("my 3d letter is: " + month.getNameOfMonth().charAt(2));
		String a = JOptionPane.showInputDialog("what is the month??");
		if (a.equalsIgnoreCase(month.getNameOfMonth())) {
			System.out.println("you're correct!!!!:D");

		} else
			System.out.println("you're wrong! " + month.getNameOfMonth());

	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	private static void askForMonth(Month jan, Month feb, Month mar, Month april, Month may, Month june, Month july,
			Month aug, Month sep, Month oct, Month nov, Month dec) {
		String a = JOptionPane.showInputDialog("select a month from jan-dec!?");
		Month selectedmonth = jan;
		if (a.equals("jan")) {
			selectedmonth = jan;

		}
		if (a.equals("feb")) {
			selectedmonth = feb;

		}
		if (a.equals("march")) {
			selectedmonth = mar;

		}
		if (a.equals("april")) {
			selectedmonth = april;

		}
		if (a.equals("may")) {
			selectedmonth = may;

		}
		if (a.equals("june")) {
			selectedmonth = june;

		}
		if (a.equals("july")) {
			selectedmonth = july;

		}
		if (a.equals("august")) {
			selectedmonth = aug;

		}
		if (a.equals("september")) {
			selectedmonth = sep;

		}
		if (a.equals("october")) {
			selectedmonth = oct;

		}
		if (a.equals("november")) {
			selectedmonth = nov;

		}
		if (a.equals("december")) {
			selectedmonth = dec;

		}
		JOptionPane.showMessageDialog(null, "the next month after " + selectedmonth.getNameOfMonth() + " is "
				+ selectedmonth.getNextMonth().getNameOfMonth());
	}

	public String getNameOfMonth() {
		return nameOfMonth;
	}

	Month(String nameOfMonth, int numberOfDays, String season) {
		this.nameOfMonth = nameOfMonth;
		this.numberOfDays = numberOfDays;
		this.season = season;
	}

}
