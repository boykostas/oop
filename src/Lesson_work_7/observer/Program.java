package Lesson_work_7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google",  jobAgency,120000);
        Company yandex = new Company("Yandex",  jobAgency,90000);
        Company geekBrains = new Company("GeekBrains",  jobAgency,95000);

        Student student1 = new Student("Student1");
        Worker worker1 = new Worker("Worker1");
        Worker worker2 = new Worker("Worker2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}
