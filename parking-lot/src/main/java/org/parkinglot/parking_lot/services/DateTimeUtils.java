package org.parkinglot.parking_lot.services;

import java.time.Duration;
import java.time.LocalDateTime;

import org.parkinglot.parking_lot.models.ParkingTicket;

public class DateTimeUtils {

	public static int getRoundOffParkingHours(ParkingTicket ticket, LocalDateTime exitDateTime) {
		Duration duration = Duration.between(ticket.getEntryDateTime(), exitDateTime);
		double totalHours = (double)duration.toMinutes() / 60;
		int roundOffHours = (int)Math.ceil(totalHours);
		return roundOffHours == 0 ? 1 : roundOffHours;
	}
	public static int getRoundOffParkingDays(int hours) {
		return (int)Math.ceil((double)hours / 24d);
	}
}
