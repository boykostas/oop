package Lesson_work_5.presenters;

import Lesson_work_5.models.Table;
import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получить список всех столиков
     */
    public Collection<Table> loadTables(){
        return model.loadTables();
    }

    public void updateTablesUI(){
        view.showTables(loadTables());
    }

    public void updateReservationResultUI(int reservationNo){
        view.showReservationResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservationDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }
}
