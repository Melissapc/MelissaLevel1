/* 
 * 1. Go to URL to see all the Dwarfs http://movies.disney.com/snow-white-and-the-seven-dwarfs/characters
 * 2. In a Runner class, make Sleepy. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make Dopey and print his name, if he has a beard and if he has glasses.
 * 6. Make Doc and print his name, if he has a beard and if he has glasses. */

public class Dwarf {

	private String name;

	Dwarf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;

	}

	public void eat() {
		System.out.println(name + " is eating a bright red apple");
	}

	/* Dopey doesn’t have a beard, but all other Dwarfs do. */
	public String getBeard() {
		// 3. Fill in this method
		if (name.equals("dopey")) {
			return "no beard";

		} else {
			return "yes beard";

		}

	}

	/* Doc is the only one with glasses */
	public String hasGlasses() {
		// 4. Fill in this method
		if (name.equals("doc")) {
			return "no glasses";
		} else {
			return "yes glasses";
		}
	}

}
