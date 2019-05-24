package com.chainsys.air.airlineservice;

import java.util.List;

import com.chainsys.air.dao.FindAllDAO;
import com.chainsys.air.dao.InsertPassengersDAO;
import com.chainsys.air.model.FlightDetails;
import com.chainsys.air.model.JourneyDetails;
import com.chainsys.air.model.Passengers;

public class AvailableFlights {

	public static List<FlightDetails> searchFlights(JourneyDetails journey) throws Exception {
		FindAllDAO findAll = new FindAllDAO();
		List<FlightDetails> searchFlights = findAll.searchFlights(journey);
		return searchFlights;
	}

	public static void insertPassengers(Passengers passengers, int loginId) throws Exception {
		InsertPassengersDAO insertPassengersDAO = new InsertPassengersDAO();
		insertPassengersDAO.addPassengers(passengers, loginId);
	}
}
