import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld2 {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		Bug boo = new Bug();

		boo.setColor(Color.blue);
		boo.setColor(Color.blue);
		Location right = new Location(4,8);
		Location left = new Location(4,7);
		Location farright = new Location(4,9);
		w.add(right,boo);
		
		Flower f = new Flower();
		Flower ft = new Flower();
		boo.turn();
		boo.turn();
		w.add(farright, f);
		w.add(left, ft);

		for (int i = 0; i < args.length; i++) {
			
		}
	}
}
