package Lesson_work_6.srp;

import java.util.ArrayList;
import java.util.List;

public class Square {
	// region Public Methods

	public int getArea() {
		return side * side;
	}
	// endregion

	// region Constructor
	private final void calcSquare(int side, Point point1) {
		Point point2 = new Point(point1.getX() + side, point1.getY());
		Point point3 = new Point(point1.getX(), point1.getY() + side);
		Point point4 = new Point(point1.getX() + side, point1.getY() + side);
		points = new ArrayList<>();
		points.add(point1);
		points.add(point2);
		points.add(point3);
		points.add(point4);
	}
	// endregion

	// region Public Getters

	public List<Point> getPoints() {
		return points;
	}

	public int getSide() {
		return side;
	}

	// endregion

	// region Private fields
	private List<Point> points;
	private int side;

	public Square(int side, Point point1) {
		this.side = side;
		calcSquare(side, point1);
	}

	// endregion

}
