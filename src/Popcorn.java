

	/*
	 * Your mission should you choose to accept it: Use these classes to cook
	 * Popcorn without changing the Microwave or Popcorn classes.
	 */

	class Microwave {
		private int cookTime;
		Popcorn thingToBeCooked;

		Microwave() {
			System.out.println("Microwave says: a Microwave has been made.");
		}

		void putInMicrowave(Popcorn thingToBeCooked) {
			System.out.println("Microwave says: popcorn put in microwave.");
			this.thingToBeCooked = thingToBeCooked;
		}

		void setTime(int cookTime) {
			System.out.println("Microwave says: cook time is set to "
					+ cookTime + " minutes.");
			this.cookTime = cookTime;
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

	public class Popcorn {

		private int kernels = 20;
		private String flavor;

		Popcorn(String flavor) {
			System.out.println("Popcorn says: making package of " + flavor
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


