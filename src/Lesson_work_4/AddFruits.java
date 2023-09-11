package Lesson_work_4;

public class AddFruits {
	public static <T extends Box<K>, K extends Fruit> T addFlow(T box, K fruit, int count) {
		if (count <= 10) {
			for (int i = 0; i < count; i++) {
				box.add(fruit);
			}
			return box;
		} else {
			throw new RuntimeException("Too match fruits. Change the box");
		}
	}

	public static <T extends Box<K>, K extends Fruit> T addByOne(T box, K fruit) {
		if (box.getCounter() < 10) {
			box.add(fruit);
			return box;
		} else {
			throw new RuntimeException("Too match fruits. Change the box");
		}
	}
}
