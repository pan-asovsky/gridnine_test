package com.gridnine.testing;

import java.util.List;

/**
 * This class provides a filtering method that excludes flights in which the total time spent on the ground exceeds two hours.
 */
class TimeOnEarthMoreTwoHours extends Filter {

	@Override
	List<Flight> getFilteredFlights(List<Flight> flightList) {
		int differenceHours = 0;
		for (Flight flight : flightList) {
			for (int i = 0; i < flight.getSegments().size() - 1; i++) {
				int arrivalHours = flight.getSegments().get(i).getArrivalDate()
						.getHour();
				int departureHours = flight.getSegments().get(i + 1)
						.getDepartureDate().getHour();
				differenceHours += departureHours - arrivalHours;
			}
			// Here you can change the number of hours to edit the filter.
			if (differenceHours <= 2) {
				filteredFlights.add(flight);
			}
		}
		return filteredFlights;
	}
}