package com.chainsys.air.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.air.airlineservice.AvailableFlights;
import com.chainsys.air.airlineservice.FlightService;
import com.chainsys.air.model.FlightDetails;
import com.chainsys.air.model.JourneyDetails;

@WebServlet("/SearchFlightsServlet")
public class SearchFlightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchFlightsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		LocalDate journeyDate = LocalDate.parse(request.getParameter("date"));
		int idbook = (int) session.getAttribute("idbook");
		LocalDate current = LocalDate.now();
		FlightService flightService = new FlightService();
		Boolean isEqual = true;
		try {
			isEqual = flightService.detailsJourney(source, destination);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		JourneyDetails journey = new JourneyDetails();
		journey.setSource(source);
		journey.setDestination(destination);
		journey.setJourneyDate(journeyDate);
		List<FlightDetails> detailslist;
		try {
			if (source.contentEquals(destination)) {
				request.setAttribute("ERROR", "source and destination cannot be equal");
				RequestDispatcher rd = request.getRequestDispatcher("singletrip.jsp");
				rd.forward(request, response);
			} else {
				if (journeyDate.compareTo(current) >= 0) {
					detailslist = AvailableFlights.searchFlights(journey);
					request.setAttribute("FLIGHTS", detailslist);
					RequestDispatcher rd = request.getRequestDispatcher("listflights.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("ERROR_DATE", "DATE SHOULD NOT BE PRIOR TO PREVIOUS DATE");
					RequestDispatcher rd = request.getRequestDispatcher("singletrip.jsp");
					rd.forward(request, response);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
