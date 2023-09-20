package Lesson_work_7.observer;

public interface Publisher {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);
}
