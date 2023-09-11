package Lesson_work_4;

public class Orange extends Fruit {
	private String color;

	public Orange(String color) {
		super(1.5f);
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("Orange %s", color);
	}
}
