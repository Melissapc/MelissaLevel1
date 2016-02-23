
public class SoupMaker1 {

	/* Make A Cup of Soup with the classes below */
	public static void main(String[] args) {
		CupOfSoup1 melissa = new CupOfSoup1("chicken soup");
		Kettle1 k = new Kettle1();
		k.boil();
		melissa.makeSoup(k.getWater());

	}
}

class CupOfSoup1 {

	private String flavor;

	CupOfSoup1(String flavor) {
		this.flavor = flavor;
	}

	void makeSoup(Kettle1.Water hotWater) {
		if (hotWater.isHot())
			System.out.println("Making " + this.flavor + " flavored Cup of Soup");
		else
			System.out.println("Can't make a Cup of Soup with cold water! ");
	}
}

class Kettle1 {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}
}
