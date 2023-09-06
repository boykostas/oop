package Lesson_work_3;

import java.util.Calendar;

public class Freelancer extends Employee {

	public Freelancer(String name, String surName, double salary, int age, int vacations, int month) {
		super(name, surName, salary, age);
		setVacations(vacations);
		setMonth(month);
	}

	@Override
	public double calculateSalary() {
		int workingDays = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, this.month, 1);
		int daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		for (int i = 0; i <= Math.round(daysOfMonth / 7); i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j == 0) {
					j = dayOfWeek;
					if (j != 5 && j != 6) {
						workingDays++;
					}
				} else {
					if (j != 5 && j != 6) {
						workingDays++;
					}
				}
			}
		}
		double salary = this.salary * (workingDays - this.vacations);
		return salary;
	}

	public int getMonth() {
		return this.month;
	}

	public int getVacations() {
		return this.vacations;
	}

	public int getAge() {
		return this.age;
	}

	public double getSalary() {
		return this.salary;
	}

	private void setMonth(int month) {
		if (month > 0 && month < 12) {
			this.month = month;
		} else {
			throw new RuntimeException("The month is specified incorrectly. It must be more or equal 0 and less 12");
		}
	}

	private void setVacations(int vacations) {
		if (vacations <= 31) {
			this.vacations = vacations;
		} else {
			throw new RuntimeException("The month is specified incorrectly. It must be more or equal 0 and less 12");
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Freelancer - ");
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
