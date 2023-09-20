package Lesson_work_7.observer;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private Publisher jobAgency;
    private static List<Vacancy> vacancy = new ArrayList<>();

    public Company(String companyName, Publisher jobAgency, int maxSalary, int experience) {
        this.jobAgency = jobAgency;
        vacancy.add(new Vacancy(experience, maxSalary, companyName));
    }

    public static List<Vacancy> getVacancy() {
        return vacancy;
    }

    public void needEmloyee() {
        for (Vacancy vacancy2 : vacancy) {
            jobAgency.sendOffer(vacancy2);
        }
    }

}
