package Lesson_work_6.srp1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

	private String promp(String message) {
		Scanner in = new Scanner(System.in);
		System.out.println(message);
		return in.nextLine();
	}

	public void inputFromConsole() {
		this.clientName = promp("Enter name: ");
		this.product = promp("Enter product: ");
		this.qnt = Integer.parseInt(promp("Enter qnt: "));
		this.price = Integer.parseInt(promp("Enter price: "));
	}

	public Order() {
	}

	public Order(String clientName, String product, int qnt, int price) {
		this.clientName = clientName;
		this.product = product;
		this.qnt = qnt;
		this.price = price;
	}

	public void saveToJSON() {
		String fileName = "order.json";
		try {
			FileWriter fileWriter = new FileWriter(fileName, false);
			fileWriter.write("{\n");
			fileWriter.write("\"clientName\":\"" + clientName + "\",\n");
			fileWriter.write("\"product\":\"" + product + "\",\n");
			fileWriter.write("\"qnt\":\"" + qnt + "\",\n");
			fileWriter.write("\"price\":\"" + price + "\"\n}");
			fileWriter.write("\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private String clientName;
	private String product;
	private int qnt;
	private int price;

}
