package com.chainsys.air.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.air.airlineservice.FlightService;
import com.chainsys.air.model.Passengers;

@WebServlet("/StatusPassengerServlet")
public class StatusPassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StatusPassengerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int bookid = (int) session.getAttribute("idbook");
		session.setAttribute("TicketBookingId", bookid);
		FlightService flightService = new FlightService();
		List<Passengers> passengers;
		try {
			passengers = flightService.checkTicketPassenger(bookid);
			request.setAttribute("LIST", passengers);
			RequestDispatcher rd = request.getRequestDispatcher("statusbooking.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
