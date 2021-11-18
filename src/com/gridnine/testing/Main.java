package com.gridnine.testing;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Flight> flightList = FlightBuilder.createFlights();

		Filter departureBeforeNow = new DepartureBeforeCurrentTime();
		print(departureBeforeNow.getFilteredFlights(flightList));

		Filter arrivalBeforeDeparture = new ArrivalBeforeDeparture();
		print(arrivalBeforeDeparture.getFilteredFlights(flightList));

		Filter timeInEarth = new TimeOnEarthMoreTwoHours();
		print(timeInEarth.getFilteredFlights(flightList));
	}

	public static void print(List<Flight> flightList) {
		for (Flight flight : flightList) {
			System.out.println(flight);
		}
		System.out.println("____________________\n");
	}
}
