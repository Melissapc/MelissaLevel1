
public class July252016 {

	public int square(int n) {
		return n * n;

	}

	public void getshape(int nsides) {
		if (nsides == 4) {
			return "square";
		}

	}

	public void write(int area, String shape) {
		System.out.println("your" + shape + "has an area of " + area);
	}
}