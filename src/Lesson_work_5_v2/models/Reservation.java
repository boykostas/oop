package Lesson_work_5_v2.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	private static int counter = 100;
	private final int reservId;
	private Date date;
	private String name;
	{
		this.reservId = ++counter;
	}

	public Reservation(Date date, String name) {
		this.date = date;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public int getReservId() {
		return reservId;
	}

	@Override
	public String toString() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return String.format("Имя %s, номер брони %d, дата " + dt.format(date), name, reservId);
	}
}
