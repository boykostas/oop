package Lesson_work_6.lsp;

public class Animal {
	protected int flySpeed = 10;

	public int getFlySpeed() {
		return flySpeed;
	}

	public Animal() {

	}

	public Animal(int flySpeed) {
		this.flySpeed = flySpeed;
	}

	public void fly() {
		System.out.println("A bird fly with speed " + flySpeed + "\n");
	}
}
