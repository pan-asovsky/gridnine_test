package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

abstract class Filter {

	List<Flight> filteredFlights = new ArrayList<>();
	abstract List<Flight> getFilteredFlights(List<Flight> flightList);
}