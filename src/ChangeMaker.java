public class ChangeMaker {
	public static void main(String[] args) {
		ChangeMaker maker = new ChangeMaker();
		maker.dimes();
	}

	int money;

	int giveChange(int money) {
		return money;

	}

	void pennies() {
		money = money / 100;
	}

	void dimes() {
		money = money / 10;
	}

	void nickels() {
		money = money / 5;
	}

	void quarters() {
		money = money / 25;
	}
}
