package Lesson_work_7.observer;

public class Cleaner extends Person {

	public Cleaner(String employeeName, TypeOfVacancy type, int experience) {
		super(employeeName, type, experience);
		super.setSalary(50000);
	}

	@Override
	public Person receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf(
					"Уборщик: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
			return this;
		} else {
			System.out.printf(
					"Уборщик: %s: Мне не нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		}
		return null;
	}

}
