package com.chainsys.air.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.air.model.FlightDetails;

@WebServlet("/FlightIdServlet")
public class FlightIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FlightIdServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Long flightId = Long.parseLong(request.getParameter("flightnumber"));
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setFlightId(flightId);
		session.setAttribute("FlightID", flightId);
		RequestDispatcher rd = request.getRequestDispatcher("passengersnumber.jsp");
		rd.forward(request, response);
	}
}