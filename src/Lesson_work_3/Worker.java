package Lesson_work_3;

public class Worker extends Employee {

	public Worker(String surName, String name, double salary, int age) {
		super(surName, name, salary, age);

	}

	public int getAge() {
		return this.age;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public double calculateSalary() {
		return salary;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Worker - ");
		stringBuilder.append(surName);
		stringBuilder.append(" ");
		stringBuilder.append(name);
		stringBuilder.append(", age: ");
		stringBuilder.append(age);
		stringBuilder.append(", salary: ");
		stringBuilder.append(salary);
		return stringBuilder.toString();
	}

}
