package Lesson_work_6.ocp;

public class Circle2 implements ShapeV2 {
	final int radius;

	public int getRadius() {
		return radius;
	}

	public Circle2(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
