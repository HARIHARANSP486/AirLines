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
import com.chainsys.air.model.FlightDetails;

@WebServlet("/TicketCancelServlet")
public class TicketCancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TicketCancelServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int idbook = Integer.parseInt(request.getParameter("bookid"));
		session.setAttribute("bookid", idbook);
		FlightService flightService = new FlightService();
		List<FlightDetails> flight;
		try {
			Boolean isFound = false;
			isFound = flightService.searchBookingId(idbook);
			if (isFound) {
				flight = flightService.checkCancelTicket(idbook);
				request.setAttribute("LIST", flight);
				RequestDispatcher rd = request.getRequestDispatcher("mybooking.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("ERROR", "PLEASE ENTER VALID BOOKINGID");
				RequestDispatcher rd = request.getRequestDispatcher("cancelticket.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
