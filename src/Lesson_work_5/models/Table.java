package Lesson_work_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;
    private final int number;

    private final Collection<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return number;
    }

    {
        this.number = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", number);
    }
}
