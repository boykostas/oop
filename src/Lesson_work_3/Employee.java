package Lesson_work_3;

public abstract class Employee implements Comparable<Employee> {
	protected String name;
	protected String surName;
	protected double salary;
	protected int age;
	protected int vacations;
	protected int month;

	public abstract double calculateSalary();

	public abstract int getAge();

	public abstract double getSalary();

	public String getSurName() {
		return this.surName;
	}

	public Employee(String surName, String name, double salary, int age) {
		this.name = name;
		this.surName = surName;
		this.salary = salary;
		this.age = age;
	}

	public Employee(String surName, String name, double salary, int age, int vacations, int month) {
		this.name = name;
		this.surName = surName;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		int res = this.surName.compareTo(o.getSurName());
		if (res == 0) {
			return name.compareTo(o.name);
		}
		return res;
	}
}
