package pro02;

public class Pool {
	static public int water = 0;

	public void outlet() {
		if (water >= 2) {
			water -= 2;

		} else {
			water = 0;
		}

	}

	public void inlet() {
		water =water + 3;
	}

	public static void main(String[] args) {
		Pool out = new Pool();
		Pool in = new Pool();
		System.out.println("水池水量" + Pool.water);
		in.inlet();
		in.inlet();
		System.out.println("向水池里注水二次");
		System.out.println("水池水量" + Pool.water);
		out.outlet();
		out.outlet();
		System.out.println("水池水量" + Pool.water);
	}
}