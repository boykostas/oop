package Lesson_work_5.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

    private static int counter = 100;
    private final int id;
    private Date date;
    private String name;

    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return String.format("Имя %s, номер брони %d, дата " + dt.format(date), name, id);
    }
}
