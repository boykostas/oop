package Lesson_work_5_v2.views;

import Lesson_work_5_v2.models.Reservation;
import Lesson_work_5_v2.models.Table;
import Lesson_work_5_v2.presenters.View;
import Lesson_work_5_v2.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class BookingView implements View {

	private ViewObserver observer;

	public void setObserver(ViewObserver observer) {
		this.observer = observer;
	}

	public void showTables(Collection<Table> tables) {
		for (Table table : tables) {
			System.out.println(table);
		}
	}

	public void reservationTable(Date reservationDate, int tableNumber, String name) {
		if (observer != null) {
			observer.onReservationTable(reservationDate, tableNumber, name);
		}
	}

	public void changeReservationTable(int oldReservationNo, Date reservationDate, int tableNumber, String name) {
		if (observer != null) {
			observer.onChangeReservationTable(oldReservationNo, reservationDate, tableNumber, name);
		}
	}

	@Override
	public void showReservationResultUI(int reservationNo) {
		if (reservationNo > 0) {
			System.out.printf("Столик успешно забронирован. Номер вашей брони №%d\n", reservationNo);
		} else {
			System.out.println("По техническим причинам забронировать столик не удалось. Попробуйте позже.");
		}
	}

	@Override
	public void showChangeReservationTableUI(int oldReservationNo, int reservationNo, boolean result) {
		if (result) {
			if (reservationNo > 0) {
				System.out.printf("Бронь #%d отменена. Номер вашей новой брони №%d\n", oldReservationNo,
						reservationNo);
			} else {
				System.out.println("По техническим причинам забронировать столик не удалось. Попробуйте позже.");
			}
		} else {
			System.out.println("По техническим отмена брони не удалось. Попробуйте позже.");
		}
	}

	@Override
	public void showReservationsAll(Collection<Table> reservaitons) {
		for (Table table : reservaitons) {
			Collection<Reservation> reservation = table.getReservation();
			Iterator iterator = reservation.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}
