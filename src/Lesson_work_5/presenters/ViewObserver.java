package Lesson_work_5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

}
