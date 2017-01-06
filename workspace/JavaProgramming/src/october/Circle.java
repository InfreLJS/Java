package october;
public class Circle {
	int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Circle c) {
		if (this.radius == c.radius)
			return true;
		else
			return false;
	}
}
