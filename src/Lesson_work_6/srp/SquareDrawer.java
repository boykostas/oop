package Lesson_work_6.srp;

public class SquareDrawer {

	// region Public Methods
	public void draw() {
		for (int i = 0; i < square.getSide() * 2 * scale; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < square.getSide() * scale - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < square.getSide() * 2 * scale - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 0; i < square.getSide() * 2 * scale; i++) {
			System.out.print("*");
		}
	}
	// endregion

	// region Public Getters

	public Square getSquare() {
		return square;
	}

	public int getScale() {
		return scale;
	}

	// endregion

	// region Constructor
	public SquareDrawer(Square square, int scale) {
		this.square = square;
		this.scale = scale;
	}

	public SquareDrawer(Square square) {
		this.square = square;
	}
	// endregion

	// region Private fields
	private Square square;
	private int scale = 1;
	// endregion

}