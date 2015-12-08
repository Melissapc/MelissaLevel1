import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Dec72015 {
	public static void main(String[] args) {
		World world = new World();
		world.show();

		Bug bug = new Bug();
		Bug bug2 = new Bug();
		bug.setColor(Color.blue);
		Flower flower = new Flower();
		Location location = new Location(4, 8);
		Location buglocation = new Location(5, 4);
		Location randomlocation = new Location(10, 10);

		world.add(location, flower);
		world.add(buglocation, bug);
		Random r = new Random();
		int row = r.nextInt(10);
		int column = r.nextInt(10);
		Location random = new Location(row, column);
		Location leftlocation = new Location(row, column - 1);
		Location rightlocation = new Location(row, column + 1);
		Flower left = new Flower();
		Flower right = new Flower();
		world.add(leftlocation, left);
		world.add(rightlocation, right);
		world.add(randomlocation, buglocation);
	}

}
