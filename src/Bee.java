
public class Bee {

	static boolean AttackTheWasp;

	public static void main(String[] args) {

		Bee bee1 = new Bee();
		Bee bee2 = new Bee();
		Bee bee3 = new Bee();

		bee1.AttackTheWasp = true;
		System.out.println(bee1.AttackTheWasp);
		System.out.println(bee2.AttackTheWasp);
		System.out.println(bee3.AttackTheWasp);
	}

}
