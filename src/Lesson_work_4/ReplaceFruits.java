package Lesson_work_4;

public class ReplaceFruits {
	public static <T extends Box<K>, K extends Fruit> T replaceFlow(T from, T to, int count) {
		if (from.getCounter() > count) {
			for (int i = 0; i < count; i++) {
				to.add(from.removeFruits());
			}
			return to;
		} else {
			throw new RuntimeException("No fruits in the box");
		}
	}

	public static <T extends Box<K>, K extends Fruit> T replaceByOne(T from, T to) {
		if (from.getCounter() > 0) {
			to.add(from.removeFruits());
			return to;
		} else {
			throw new RuntimeException("No fruits in the box");
		}
	}

	public static void removeByOne(Box<Apple> box2, Box<Apple> box3) {
	}
}