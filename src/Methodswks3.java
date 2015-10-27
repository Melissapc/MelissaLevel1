import javax.swing.JFrame;

public class Methodswks3 {
	public static void main(String[] args) {
		Methodswks3 wks = new Methodswks3();
		wks.getWindow();
		JFrame window = wks.getWindow();

		int slices = wks.getNumberofPizzaSlicesLeft();

		String faveVeggie = wks.getFavoriteVegetable("joon");

		wks.peel("potato");

		boolean healthyOrNot = wks.isHealthy("avocado");

		wks.simmer("soup");

		wks.eat("pizza");

		double a = wks.getDinnerTime();

		String b = wks.getFavoriteFood("lasagna");
		wks.chomp();
		boolean c = wks.isTasty();
	}

	void simmer(String typeofwater) {

	}

	boolean isHealthy(String fruit) {
		return true;

	}

	void peel(String vegetable) {

	}

	void eat(String food) {

	}

	double getDinnerTime() {
		return 5;

	}

	String getFavoriteFood(String personsName) {
		return personsName;
	}

	void chomp() {
	}

	boolean isTasty() {
		return false;
	}

	JFrame getWindow() {
		return null;

	}

	int getNumberofPizzaSlicesLeft() {
		return 0;

	}

	String getFavoriteVegetable(String name) {
		return null;

	}

}
