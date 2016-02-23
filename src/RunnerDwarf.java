
public class RunnerDwarf {
	public static void main(String[] args) {
		Dwarf sleepy = new Dwarf("sleepy");
		String a = sleepy.getName();
		System.out.println(a);
		sleepy.eat();

		Dwarf dopey = new Dwarf("dope");
		String b = dopey.getName();
		System.out.println(b);

		System.out.println(dopey.getBeard());
		System.out.println(dopey.hasGlasses());

		Dwarf doc = new Dwarf("doc");
		String c = doc.getName();
		System.out.println(c);
		System.out.println(doc.hasGlasses());
		System.out.println(doc.getBeard());

	}

}
