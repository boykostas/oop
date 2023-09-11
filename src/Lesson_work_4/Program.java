package Lesson_work_4;

public class Program {
	public static void main(String[] args) {
		Box<Apple> box1 = new Box<>();

		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("red"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("red"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		AddFruits.addByOne(box1, new Apple("green"));
		AddFruits.addByOne(box1, new Apple("yellow"));
		box1.showBox();
		System.out.println(box1.getWeight());

		Box<Apple> box2 = AddFruits.addFlow(new Box<Apple>(), new Apple("green"),
				10);
		box2.showBox();
		System.out.println(box2.getWeight());

		 Box<Apple> box3 = new Box<>();
		 ReplaceFruits.removeByOne(box2, box3);
		 ReplaceFruits.removeByOne(box2, box3);
		 ReplaceFruits.removeByOne(box2, box3);
		 box2.showBox();
		 box3.showBox();

		Box<Orange> box5 = new Box<>();
		AddFruits.addFlow(box5, new Orange("yellow"), 6);

		Box<Apple> box4 = new Box<>();
		ReplaceFruits.replaceFlow(box1, box4, 5);
		box1.showBox();
		box4.showBox();

		System.out.println(box1.getWeight());
		System.out.println(box4.getWeight());

		System.out.println(box1.myProblemMethodForCompare(box4));
	}
}
