package Lesson_work_6.lsp;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Penguin penguin = new Penguin();
		List<Animal> birds = new ArrayList<>();
		birds.add(animal);
		birds.add(animal1);
		birds.add(animal2);
		birds.add(animal3);
		birds.add(duck);
		birds.add(duck2);
		birds.add(penguin);
		processFly(birds);
	}

	public static void processFly(List<Animal> birds) {
		for (Animal bird : birds) {
			bird.fly();
		}
	}
}
