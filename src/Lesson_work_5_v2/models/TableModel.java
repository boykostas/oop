package Lesson_work_5_v2.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import Lesson_work_5_v2.presenters.Model;

public class TableModel implements Model {
	public Collection<Table> tables;

	/**
	 * Замещение БД
	 */
	@Override
	public Collection<Table> loadTables() {
		if (tables == null) {
			tables = new ArrayList<Table>();
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
			tables.add(new Table());
		}
		return tables;
	}

	/**
	 * 
	 * @param reservationDate дата брони
	 * @param tableNumber     номер столика из Table
	 * @param name            имя бронирующего
	 * @return номер брони
	 */
	@Override
	public int reservationTable(Date reservationDate, int tableNumber, String name) {
		for (Table table : tables) {
			if (table.getNumber() == tableNumber) {
				Reservation reservation = new Reservation(reservationDate, name);
				table.getReservation().add(reservation);
				return reservation.getReservId();
			}
		}
		return -1;
	}

	@Override
	public boolean removeReservationTable(int oldReservationNo) {
		for (Table table : tables) {
			Collection<Reservation> reservation = table.getReservation();
			Iterator iterator = reservation.iterator();
			while (iterator.hasNext()) {
				if (((Reservation) iterator.next()).getReservId() == oldReservationNo) {
					iterator.remove();
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Collection<Table> getShowReservationsAll() {
		return tables;
	}
}
