package com.chainsys.air.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.air.airlineservice.FlightService;
import com.chainsys.air.model.JourneyDetails;

@WebServlet("/PassengerDetailsServlet")
public class PassengerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassengerDetailsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer adultNumber = Integer.parseInt(request.getParameter("adultnumber"));
		session.setAttribute("adultcount", adultNumber);
		Integer childNumber = Integer.parseInt(request.getParameter("childnumber"));
		session.setAttribute("childcount", childNumber);
		Integer babyNumber = Integer.parseInt(request.getParameter("babynumber"));
		session.setAttribute("babycount", babyNumber);
		long flightId = (long) request.getSession().getAttribute("FlightID");
		JourneyDetails journeyDetails = new JourneyDetails();
		journeyDetails.setAdultNumber(adultNumber);
		journeyDetails.setChildNumber(childNumber);
		journeyDetails.setBabyNumber(babyNumber);
		FlightService flightService = new FlightService();
		int totalTravelPassengers = adultNumber + childNumber + babyNumber;
		session.setAttribute("totalTravelpassengers", totalTravelPassengers);
		request.setAttribute("adultcount", adultNumber);
		request.setAttribute("childcount", childNumber);
		request.setAttribute("babycount", babyNumber);
		int flightAvailableSeats = 0;
		try {
			flightAvailableSeats = flightService.totalSeats(flightId);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		session.setAttribute("flightseats", flightAvailableSeats);
		Boolean isFound = false;
		try {
			isFound = flightService.seatsCheck(totalTravelPassengers, flightId);
			if (isFound) {
				RequestDispatcher rd = request.getRequestDispatcher("Demo.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("notseat.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
