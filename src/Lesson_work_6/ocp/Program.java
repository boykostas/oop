package Lesson_work_6.ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		// V1==============================================
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(25));
		shapes.add(new Square(5));
		shapes.add(new RightTriangle(5, 6));
		double summArea = 0;
		Shape a = new Square(8);
		for (Shape shape : shapes) {
			if (shape instanceof RightTriangle) {
				RightTriangle rightTriangle = (RightTriangle) shape;
				summArea += rightTriangle.getKatet1() * rightTriangle.getKatet2();
			}
			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				summArea += Math.PI * circle.getRadius() * circle.getRadius();
			}
			if (shape instanceof Square) {
				Square square = (Square) shape;
				summArea += Math.pow(square.getSide(), 2);
			}
		}
		System.out.println("Сумма площадей фигур: " + summArea + "\n");

		// V2==============================================
		List<ShapeV2> shapes2 = new ArrayList<>();
		shapes2.add(new Circle2(25));
		shapes2.add(new Square2(5));
		shapes2.add(new RightTriangle2(5, 6));
		double summArea2 = 0;
		for (ShapeV2 shapeV2 : shapes2) {
			summArea2 += shapeV2.getArea();
		}
		System.out.println("Сумма площадей фигур: " + summArea2 + "\n");
	}
}
