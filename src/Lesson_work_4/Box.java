package Lesson_work_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Box<T extends Fruit> {
	private List<T> arr;
	private int counter;
	private float weight;

	public Box() {
	}

	{
		arr = new ArrayList<>();
	}

	public int getCounter() {
		this.counter = arr.size();
		return this.counter;

	}

	protected void add(T fruit) {
		if (getCounter() <= 10) {
			arr.add(fruit);
		} else {
			throw new RuntimeException("Too match fruits. Change the box");
		}
	}

	protected T removeFruits() {
		T item = this.arr.remove(getCounter() - 1);
		return item;
	}

	public void showBox() {
		Stream.of(arr.toString())
				.forEach(System.out::println);
	}

	public float getWeight() {
		if (getCounter() > 0) {
			this.weight = arr.get(0).getWeight() * getCounter();
			return weight;
		} else {
			return 0;
		}
	}

	public boolean myProblemMethodForCompare(Box<?> o2) {
		int res = new CamparatorMy().compare(this, o2);
		if (res > 0)
			return true;
		else
			return false;
	}

	class CamparatorMy implements Comparator<Box<?>> {
		@Override
		public int compare(Box<?> o1, Box<?> o2) {
			if ((int) o1.getWeight() < (int) o2.getWeight()) {
				return -1;
			} else if ((int) o1.getWeight() == (int) o2.getWeight()) {
				return 1;
			} else {
				return 0;
			}
		}

	}

}