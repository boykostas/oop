package Lesson_work_4;

public class Apple extends Fruit {
	private String color;

	public Apple(String color) {
		super(1);
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("Apple %s", color);
	}

}
