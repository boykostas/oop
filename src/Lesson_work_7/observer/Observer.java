package Lesson_work_7.observer;

public interface Observer {
    Person receiveOffer(String companyName, int experience, TypeOfVacancy typeOfVacancy, int salary);

    TypeOfVacancy getType();

    int getExperience();
}
