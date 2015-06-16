import org.teachingextensions.logo.Tortoise;

public class Tortoiseadventures {
	public static void main(String[] args) {
		Tortoiseadventures tort = new Tortoiseadventures();
	}

	Tortoiseadventures() {
square(50);
triangle(70);

	}

	public void square(int size) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			Tortoise.move(size);
			Tortoise.turn(90);

		}
	}
	 public void triangle(int size){
	 Tortoise.show();
	 Tortoise.setSpeed(10);
	 for (int i = 0; i < 360/3; i++) {
		Tortoise.move(size);
		Tortoise.turn(120);
	}
	}
}
