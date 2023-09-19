package Lesson_work_6.lsp;

public class Penguin extends Animal {

	public Penguin() {
		super.flySpeed = 0;
	}

	@Override
	public void fly() {
		System.out.println("Penguin dosen't fly");
	}
}
