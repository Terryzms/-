package pro02;

public class Graphical {
	final static double PI = 3.1415926;

	public static void main(String[] args) {
		Circular circular = new Circular(3.0);
		Spherical spherical = new Spherical(3.0);

	}

}

class Circular {
	double radius;
	double area;

	public Circular(double radius) {
		this.radius = radius;
		area = Graphical.PI * radius * radius;
		System.out.println("圆的半径" + radius);
		System.out.println("圆的面积" + area);
	}

}

class Spherical {
	double radius;
	double volume; 

	public Spherical(double radius) {
		this.radius = radius;
		volume = 4 / 3 * Graphical.PI * radius * radius * radius;

		System.out.println("圆的半径" + radius);
		System.out.println("圆的体积" + volume);
	}
}
