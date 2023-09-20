package Lesson_work_7.observer;

public class Manager extends Person {

	public Manager(String employeeName, TypeOfVacancy type, int experience) {
		super(employeeName, type, experience);
		super.setSalary(100000);
	}

	@Override
	public Person receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary) {
		if (super.getSalary() <= salary) {
			System.out.printf(
					"PM: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					getEmployeeName(), companyName, typeOfVacancy, experience, salary);
			return this;
		} else {
			System.out.printf(
					"PM: %s: Мне не нужна эта работа!(Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
					getEmployeeName(), companyName, typeOfVacancy, experience, salary);
		}
		return null;
	}

}
