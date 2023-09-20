package Lesson_work_7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JobAgency implements Publisher {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        Person item;
        ListIterator<Observer> observer = observers.listIterator();
        while (observer.hasNext()) {
            Observer itemNext = observer.next();
            if ((itemNext.getType().equals(vacancy.getType())
                    && itemNext.getExperience() >= vacancy.getExperience())
                    || itemNext.getType().equals(TypeOfVacancy.Junior_developer)) {
                item = itemNext.receiveOffer(vacancy.getCompanyname(),
                        vacancy.getExperience(),
                        vacancy.getType(),
                        vacancy.getSalary());
                if (item != null) {
                    System.out.println("!!!!!!!!!!!!!!!!!!Этот человек согласен на работу " + item);
                    observer.remove();
                    System.out.println("!!!!!!!!!!!!!!!!!!На эту вакансию нашелся желающий " + vacancy);
                    ListIterator<Vacancy> iter = Company.getVacancy().listIterator();
                    while (iter.hasNext()) {
                        Vacancy vavancyNext = iter.next();
                        if (vavancyNext.equals(vacancy)) {
                            vavancyNext.remove(vacancy);
                        }
                    }
                }
            }
        }
    }

}