package Lesson_work_7.observer;

public abstract class Person implements Observer {
	private final String employeeName;
	private int salary;
	private TypeOfVacancy type;
	private int experience;

	public Person(String employeeName, TypeOfVacancy type, int experience) {
		this.experience = experience;
		this.employeeName = employeeName;
		this.type = type;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public TypeOfVacancy getType() {
		return type;
	}

	public void setSalary(TypeOfVacancy type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("name - %s, salary - %d, experience - %d, typeOfVacancy - %s", employeeName, salary,
				experience, type);
	}
}
