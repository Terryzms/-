package pro02;

public class StaticVariable {
	static int x;
	int y;

	public StaticVariable(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		StaticVariable a = new StaticVariable(1, 3);
		StaticVariable b = new StaticVariable(11, 13);
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
	}
}
