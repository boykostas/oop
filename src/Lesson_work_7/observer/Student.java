package Lesson_work_7.observer;

public class Student implements Observer {

    private String name;

    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }
}
