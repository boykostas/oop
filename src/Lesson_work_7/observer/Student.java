package Lesson_work_7.observer;

public class Student extends Person {

    public Student(String employeeName, TypeOfVacancy type, int experience) {
        super(employeeName, type, experience);
        super.setSalary(2000);
    }

    @Override
    public Person receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary) {
        if (super.getSalary() <= salary) {
            System.out.printf(
                    "Студент: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
                    super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
            super.setSalary(salary);
            return this;
        } else {
            System.out.printf(
                    "Студент: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Опыт: %d; Заработная плата: %d)\n",
                    super.getEmployeeName(), companyName, typeOfVacancy, experience, salary);
        }
        return null;
    }

}