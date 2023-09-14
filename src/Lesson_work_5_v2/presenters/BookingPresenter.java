package Lesson_work_5_v2.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {
	private final Model model;
	private final View view;

	public BookingPresenter(Model model, View view) {
		this.model = model;
		this.view = view;
		this.view.setObserver(this);
	}

	public void showReservationsAllUI() {
		view.showReservationsAll(model.getShowReservationsAll());
	}

	public void updateTablesUI() {
		view.showTables(model.loadTables());
	}

	public void updateReservationResultUI(int reservationNo) {
		view.showReservationResultUI(reservationNo);
	}

	public void сhangeReservationTableUI(int oldReservationNo, int reservationNo, boolean result) {
		view.showChangeReservationTableUI(oldReservationNo, reservationNo, result);
	}

	@Override
	public void onReservationTable(Date reservationDate, int tableNumber, String name) {
		int reservationNo = model.reservationTable(reservationDate, tableNumber, name);
		updateReservationResultUI(reservationNo);
	}

	@Override
	public void onChangeReservationTable(int oldReservationNo, Date reservationDate, int tableNumber, String name) {
		boolean result = model.removeReservationTable(oldReservationNo);
		int reservationNo = model.reservationTable(reservationDate, tableNumber, name);
		сhangeReservationTableUI(oldReservationNo, reservationNo, result);
	}

}
