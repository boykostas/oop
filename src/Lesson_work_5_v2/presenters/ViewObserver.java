package Lesson_work_5_v2.presenters;

import java.util.Date;

public interface ViewObserver {
	public void onReservationTable(Date reservationDate, int tableNumber, String name);

	public void onChangeReservationTable(int oldReservationNo, Date reservationDate, int tableNumber, String name);
}
