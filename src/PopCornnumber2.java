/* Your mission should you choose to accept it:
 *         Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

class Microwave7 {

	private int cookTime;
	PopCornnumber2 thingToBeCooked;

	Microwave7() {

		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(PopCornnumber2 thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
		this.cookTime = cookTimeInMinutes;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime * 10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}

public class PopCornnumber2 {

	private int kernels = 20;
	private String flavor;

	public static void main(String[] args) {
		PopCornnumber2 p = new PopCornnumber2("kettle");
		Microwave7 m = new Microwave7();

		m.putInMicrowave(p);
		m.setTime(2);
		m.startMicrowave();
		p.applyHeat();

	}

	PopCornnumber2(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}

	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
