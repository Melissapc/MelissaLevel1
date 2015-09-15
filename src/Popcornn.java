/* Your mission should you choose to accept it:
 *         Add a main method to the Popcorn class to cook a bag of Popcorn. Don't change the existing methods.
 */

public class Popcornn {
	public static void main(String[] args) {
		Popcornn corn = new Popcornn("Kettle corn");
		Microwaves awesome = new Microwaves();

		awesome.putInMicrowave(corn);
		awesome.setTime(2);
		awesome.startMicrowave();

	}

	private int kernels = 20;
	private String flavor;

	Popcornn(String flavor) {
		System.out.println("Popcorn says: making package of " + this.flavor
				+ " popcorn.");
		this.flavor = flavor;
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

class Microwaves {
	private int cookTime;
	Popcornn thingToBeCooked;

	Microwaves() {
		System.out.println("Microwave says: a Microwave has been made.");
	}

	void putInMicrowave(Popcornn thingToBeCooked) {
		System.out.println("Microwave says: popcorn put in microwave.");
		this.thingToBeCooked = thingToBeCooked;
	}

	void setTime(int cookTimeInMinutes) {
		System.out.println("Microwave says: cook time is set to " + cookTime
				+ " minutes.");
		this.cookTime = cookTimeInMinutes;
	}

	void startMicrowave() {
		if (thingToBeCooked == null)
			System.out
					.println("Microwave says: there's nothing in the microwave!");
		for (int i = 0; i < cookTime * 10 + 1; i++) {
			thingToBeCooked.applyHeat();
		}
	}
}
