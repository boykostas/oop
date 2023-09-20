package Lesson_work_7.observer;

import java.util.Random;

public class Vacancy {
	private Random random = new Random();
	private int experience;
	private int salary;
	private TypeOfVacancy type;
	private String companyName;

	public Vacancy(int experience, int maxSalary, String companyName) {
		this.salary = random.nextInt(maxSalary);
		this.experience = experience;
		this.type = TypeOfVacancy.values()[random.nextInt(4)];
		this.companyName = companyName;
	}

	public TypeOfVacancy getType() {
		return type;
	}

	public int getSalary() {
		return salary;
	}

	public int getExperience() {
		return experience;
	}

	public String getCompanyname() {
		return companyName;
	}

	@Override
	public String toString() {
		return String.format("CompanyName - %s, salary - %d, experience - %d, typeOfVacancy - %s\n", companyName,
				salary,
				experience, type);
	}

	public void remove(Vacancy vacancy) {
	}
}
