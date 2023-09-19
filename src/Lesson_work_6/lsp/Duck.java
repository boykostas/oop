package Lesson_work_6.lsp;

public class Duck extends Animal {

	public Duck() {
		super.flySpeed = 15;
	}

	@Override
	public void fly() {
		System.out.println("The duck fly with speed " + flySpeed + "\n");
	}
}
