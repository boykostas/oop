package Lesson_work_7.observer;

public class Program {
    public static void main(String[] args) {
        Publisher jodAgency = new JobAgency();
        Company company1 = new Company("Roga", jodAgency, 20000, 0);
        Company company2 = new Company("Kopyta", jodAgency, 50000, 0);
        Company company3 = new Company("Volga", jodAgency, 100000, 2);
        Student student1 = new Student("Misha", TypeOfVacancy.Junior_developer, 0);
        Worker worker1 = new Worker("Dima", TypeOfVacancy.Developer, 2);
        Cleaner cleaner1 = new Cleaner("Sasha", TypeOfVacancy.Cleaner, 3);
        Manager manager1 = new Manager("Sonya", TypeOfVacancy.PM, 8);
        jodAgency.registerObserver(student1);
        jodAgency.registerObserver(cleaner1);
        jodAgency.registerObserver(worker1);
        jodAgency.registerObserver(manager1);
        for (int i = 0; i < 3; i++) {
            company1.needEmloyee();
            company2.needEmloyee();
            company3.needEmloyee();
        }
        System.out.println(Company.getVacancy());
    }
}
