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
import com.chainsys.air.model.FlightDetails;

@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Payment() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int adultCount = (int) session.getAttribute("adultcount");
		int childCount = (int) session.getAttribute("childcount");
		int babyCount = (int) session.getAttribute("babycount");
		Long flightId = (Long) session.getAttribute("FlightID");
		int idbook = (int) session.getAttribute("idbook");
		int availableSeats = (int) session.getAttribute("flightseats");
		int totalCount = adultCount + childCount + babyCount;
		int updateSeatCount = availableSeats - totalCount;
		session.setAttribute("UpdateSeats", updateSeatCount);
		FlightService flightService = new FlightService();
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setFlightId(flightId);
		double adultTotalAmount = 0;
		try {
			flightService.updateSeats(updateSeatCount, flightId);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			adultTotalAmount = adultCount * (flightService.adultAmount(flightDetails));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		double childTotalAmount = 0;
		try {
			childTotalAmount = childCount * (flightService.childAmount(flightDetails));
		} catch (Exception e) {
			e.printStackTrace();
		}
		double babyTotalAmount = 0;
		try {
			babyTotalAmount = babyCount * (flightService.babyAmount(flightDetails));
		} catch (Exception e) {
			e.printStackTrace();
		}
		double totalAmount = 0;
		FlightService service = new FlightService();
		totalAmount = adultTotalAmount + childTotalAmount + babyTotalAmount;
		request.setAttribute("totalamount", totalAmount);
		session.setAttribute("totalamount", totalAmount);
		RequestDispatcher rd = request.getRequestDispatcher("paymentprocess.jsp");
		rd.forward(request, response);
	}
}
