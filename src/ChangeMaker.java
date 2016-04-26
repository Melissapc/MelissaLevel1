public class ChangeMaker {
	public static void main(String[] args) {
		ChangeMaker maker = new ChangeMaker();
		maker.giveChange(57);

	}

	int money;

	CoinChanger pennies = new CoinChanger(100, 1);
	CoinChanger dimes = new CoinChanger(100, 10);
	CoinChanger nickels = new CoinChanger(100, 5);
	CoinChanger quarters = new CoinChanger(100, 25);

	ChangeMaker() {

	}

	void giveChange(int money) {
		int counter = 0;
		while (money > 0) {
			money = giveonecoin(money);
			counter = counter + 1;
			System.out.println(counter + " " + money);
		}
	}

	int giveonecoin(int amount) {
		if (quarters.getMoney() <= amount) {
			if (quarters.hasCoins()) {
				quarters.despense();
				return amount - quarters.getMoney();
			}
		}

		if (dimes.getMoney() <= amount) {
			if (dimes.hasCoins()) {
				dimes.despense();
				return amount - dimes.getMoney();
			}
		}

		if (nickels.getMoney() <= amount) {
			if (nickels.hasCoins()) {
				nickels.despense();
				return amount - nickels.getMoney();
			}
		}

		if (pennies.getMoney() <= amount) {
			if (pennies.hasCoins()) {
				pennies.despense();
				return amount - pennies.getMoney();
			}
		}
		return 0;

	}

	void givepennies() {
		money = money / 100;
	}

	void givedimes() {
		money = money / 10;
	}

	void givenickels() {
		money = money / 5;
	}

	void givequarters() {
		money = money / 25;
	}

}
