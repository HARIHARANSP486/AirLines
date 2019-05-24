package com.chainsys.air.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.air.dao.InsertPassengersDAO;
import com.chainsys.air.model.Passengers;

@WebServlet("/AddPassengersServlet")
public class AddPassengersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddPassengersServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int bookid = (int) session.getAttribute("idbook");
		List<Passengers> passenger = new ArrayList<>();
		int count = (int) session.getAttribute("totalTravelpassengers");
		int i;
		for (i = 0; i < count; i++) {
			Passengers passengers = new Passengers();
			String name = "name" + i;
			passengers.setName(request.getParameter(name));
			String gender = "gender" + i;
			passengers.setGender(request.getParameter(gender));
			passenger.add(passengers);
		}
		if (i == count) {
			InsertPassengersDAO insertDAO = new InsertPassengersDAO();
			try {
				long flightId = (long) request.getSession().getAttribute("FlightID");
				insertDAO.addPassengers(passenger, flightId, bookid);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("confirm.jsp");
			rd.forward(request, response);
		}
	}
}