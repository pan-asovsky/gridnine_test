package com.gridnine.testing;

import java.util.List;

/**
 * This class provides a filtering method that excludes flights with an arrival date earlier than the departure date.
 */
class ArrivalBeforeDeparture extends Filter {

	@Override
	List<Flight> getFilteredFlights(List<Flight> flightList) {
		for (Flight flight : flightList) {
			if (!flight.getSegments().get(0).getArrivalDate()
					.isBefore(flight.getSegments().get(0).getDepartureDate())) {
				filteredFlights.add(flight);
			}
		}
		return filteredFlights;
	}
}