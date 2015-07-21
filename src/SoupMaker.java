public class SoupMaker{
// CHICKEN NOODLE SOUP WITH THE CHICKEN ON TOP !!! <3\\
	/*Make A Cup of Soup with the classes below*/
public static void main(String[] args) {
	CupOfSoup sopa = new CupOfSoup("ChickenNoodle");
	Kettle ket = new Kettle();
	ket.getWater();
	ket.boil();
	
}
}

class CupOfSoup {

	private String flavor;

	CupOfSoup(String flavor){
		this.flavor = flavor;
	}

	void makeSoup(Kettle.Water hotWater) {
		if (hotWater.isHot())
			System.out.println("Making " + this.flavor + " flavored Cup of Soup");
		else
			System.out.println("Can't make a Cup of Soup with cold water! ");
	}
}

class Kettle {

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