package Lesson_work_6.ocp;

public class Square2 implements ShapeV2 {
	private final int side;

	public int getSide() {
		return side;
	}

	public Square2(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}
}
