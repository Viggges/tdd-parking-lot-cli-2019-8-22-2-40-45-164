package com.oocl.cultivation;

public class ParkingBoy {

	private final ParkingLot parkingLot;
	private String lastErrorMessage;

	public ParkingBoy(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public ParkingTicket park(Car car) {
		// TODO: Please implement the method
		if (parkingLot.getAvailableParkingPosition() >= 0) {
			lastErrorMessage = "The parking lot is full.";
			return null;
		}
		ParkingTicket parkingTicket = parkingLot.fetchTicket(car);
		lastErrorMessage = null;
		return parkingTicket;
	}

	public Car fetch(ParkingTicket ticket) {
		// TODO: Please implement the method
		if (ticket == null) {
			lastErrorMessage = "Please provide your parking ticket.";
			return null;
		}
		Car car = parkingLot.fetchCar(ticket);
		if (car == null) {
			lastErrorMessage = "Unrecognized parking ticket.";
		}
		return car;
	}

	public String getLastErrorMessage() {
		return lastErrorMessage;
	}
}
