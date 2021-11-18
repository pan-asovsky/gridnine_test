package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This class provides a filtering method that excludes flights departing earlier than the current time.
 */
class DepartureBeforeCurrentTime extends Filter {

	@Override
	List<Flight> getFilteredFlights(List<Flight> flightList) {
		for (Flight flight : flightList) {
			if (flight.getSegments().get(0).getDepartureDate()
					.isAfter(LocalDateTime.now())) {
				filteredFlights.add(flight);
			}
		}
		return filteredFlights;
	}
}