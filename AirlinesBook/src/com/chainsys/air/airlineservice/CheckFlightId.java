package com.chainsys.air.airlineservice;

import com.chainsys.air.dao.CheckingDAO;
import com.chainsys.air.model.FlightDetails;

public class CheckFlightId {
	public Boolean checkId(FlightDetails flightDetails) throws Exception {
		CheckingDAO checkingDAO = new CheckingDAO();
		Boolean isStatus = checkingDAO.flightIdCheck(flightDetails);
		return isStatus;
	}
}
