public class CoinChanger {
	public static void main(String[] args) {
		CoinChanger cc = new CoinChanger(100, 5);
		cc.despense();
		cc.add();
		cc.subtract();
		cc.addsdollar();
		System.out.println(cc.coins);
		System.out.println(cc.totalMoney());
	}

	int coins;
	int money;

	CoinChanger(int coins, int money) {
		this.coins = coins;
		this.money = money;
	}

	void despense() {
		System.out.println("i am dispensing " + money + " cents");
		if (coins == 0) {
			coins = coins - 0;
		}
		coins = coins - 1;

	}

	void add() {
		System.out.println("i am adding a coin ");

		coins = coins + 1;
	}

	void subtract() {
		System.out.println("i am subtracting a coin ");
		coins = coins - 1;
	}

	void addsdollar() {
		System.out.println("im adding a dollar");
		coins = coins + 100 / money;
	}

	int totalMoney() {
		System.out.println("the total amount of money is");
		return coins * money;
	}
}
