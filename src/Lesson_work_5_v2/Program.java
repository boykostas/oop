package Lesson_work_5_v2;

import java.util.Date;

import Lesson_work_5_v2.models.TableModel;
import Lesson_work_5_v2.presenters.BookingPresenter;
import Lesson_work_5_v2.views.BookingView;

public class Program {

	public static void main(String[] args) {
		BookingView view = new BookingView();
		BookingPresenter bookingPresenter = new BookingPresenter(new TableModel(), view);
		bookingPresenter.updateTablesUI();
		view.reservationTable(new Date(), 3, "Sergey");
		view.reservationTable(new Date(), 1, "Viktor");
		view.reservationTable(new Date(), 2, "Julia");
		bookingPresenter.showReservationsAllUI();
		view.changeReservationTable(103, new Date(), 2, "Stanislav");
		bookingPresenter.showReservationsAllUI();
	}

}
