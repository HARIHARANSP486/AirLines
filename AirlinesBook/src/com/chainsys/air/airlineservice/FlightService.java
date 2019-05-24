package com.chainsys.air.airlineservice;

import java.util.List;

import com.chainsys.air.dao.AmountDAO;
import com.chainsys.air.dao.CanelTicketDAO;
import com.chainsys.air.dao.CheckingDAO;
import com.chainsys.air.dao.FindAllDAO;
import com.chainsys.air.dao.JourneyDAO;
import com.chainsys.air.dao.LoginDAO;
import com.chainsys.air.model.FlightDetails;
import com.chainsys.air.model.Passengers;

public class FlightService {
	public static Double adultAmount(FlightDetails flightDetails) throws Exception {
		AmountDAO amountDAO = new AmountDAO();
		Double adultAmount = amountDAO.adultAmount(flightDetails);
		return adultAmount;
	}

	public static Boolean detailsJourney(String source, String destination) throws Exception {
		Boolean isThere = true;
		CheckingDAO check = new CheckingDAO();
		isThere = check.journeyEqual(source, destination);
		return isThere;
	}

	/*public static void deleteId(int bookid, int idupdateid) throws Exception {
		CheckingDAO check = new CheckingDAO();
		check.deleteBookId(bookid, idupdateid);

	}*/

	public static List<Passengers> checkCancelPassenger(int bookid) throws Exception {
		FindAllDAO findAll = new FindAllDAO();
		List<Passengers> passenger = findAll.getPassenger(bookid);
		return passenger;
	}

	public static List<FlightDetails> checkCancelTicket(int bookId) throws Exception {
		FindAllDAO findAllDAO = new FindAllDAO();
		List<FlightDetails> ticketcancelStatus = findAllDAO.checkCancelStatus(bookId);
		return ticketcancelStatus;
	}

	public static void deletePassenger(int bookId) throws Exception {
		CanelTicketDAO cancelDAO = new CanelTicketDAO();
		cancelDAO.passengerDelete(bookId);

	}

	public static List<Passengers> checkTicketPassenger(int bookId) throws Exception {
		FindAllDAO findAll = new FindAllDAO();
		List<Passengers> passenger = findAll.getPassenger(bookId);
		return passenger;
	}
	public static Boolean findId(int bookId) throws Exception{
		Boolean isFind=false;
		CheckingDAO checkDAO=new CheckingDAO();
		isFind=checkDAO.idFind(bookId);
		return isFind;
	}
	public static List<FlightDetails> checkTicket(int bookid) throws Exception {
		FindAllDAO findAllDAO = new FindAllDAO();
		List<FlightDetails> ticketStatus = findAllDAO.checkStatus(bookid);
		return ticketStatus;
	}

	/*
	 * public static void ticketCancel(int BookingId) throws Exception {
	 * CanelTicketDAO cancelTicketDAO = new CanelTicketDAO();
	 * cancelTicketDAO.cancelTicket(BookingId); }
	 */
	public static Boolean searchBookingId(int bookingId) throws Exception {
		CheckingDAO checkingDAO = new CheckingDAO();
		Boolean isFound = false;
		isFound = checkingDAO.checkBookingId(bookingId);
		return isFound;
	}

	public static Double childAmount(FlightDetails flightDetails) throws Exception {
		AmountDAO amountDAO = new AmountDAO();
		Double childAmount = amountDAO.childAmount(flightDetails);
		return childAmount;
	}

	public static Double babyAmount(FlightDetails flightDetails) throws Exception {
		AmountDAO amountDAO = new AmountDAO();
		Double babyAmount = amountDAO.babyAmount(flightDetails);
		return babyAmount;
	}

	public static Boolean loginService(String userName, String password) throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		Boolean isFound = false;
		isFound = loginDAO.login(userName, password);
		return isFound;
	}

	public static int getLoginService(String userName, String password) throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		int loginId = loginDAO.getLogin(userName, password);
		return loginId;
	}

	public static Boolean seatsCheck(int totalPassengers, long flightId) throws Exception {
		Boolean isStatus = false;
		CheckingDAO checkingDAO = new CheckingDAO();
		isStatus = checkingDAO.flightSeatsCheck(totalPassengers, flightId);
		return isStatus;
	}

	public static void updateSeats(int updateCount, long FligtId) throws Exception {
		JourneyDAO journeyDAO = new JourneyDAO();
		journeyDAO.seatsUpdate(updateCount, FligtId);
	}

	public static int totalSeats(long flightId) throws Exception {
		JourneyDAO journeyDAO = new JourneyDAO();
		int overallSeats = journeyDAO.totalSeats(flightId);
		return overallSeats;
	}

	public static List<Passengers> cancelTicket(int loginId) throws Exception {
		CanelTicketDAO cancelTicketDAO = new CanelTicketDAO();
		List<Passengers> selectCancel = cancelTicketDAO.cancelProcess(loginId);
		return selectCancel;
	}

	public static int getId(String userName, String password) throws Exception {
		LoginDAO loginDAO = new LoginDAO();
		int id = loginDAO.id(userName, password);
		return id;
	}

	public static int id(String userName, String password) throws Exception {
		LoginDAO login = new LoginDAO();
		int bookid = login.id(userName, password);
		return bookid;
	}

	/*
	 * public static void getBookId() throws Exception{ LoginDAO loginDAO=new
	 * LoginDAO(); loginDAO.createBookId(); }
	 */
	public static int getBookingId(int loginId) throws Exception {
		LoginDAO login = new LoginDAO();
		int bkid = login.getBkId(loginId);
		return bkid;
	}

	/*
	 * public static void BookId() throws Exception{ LoginDAO loginDAO=new
	 * LoginDAO(); loginDAO.createBookId(); }
	 */
	public static void updateQuery(int idUpdate) throws Exception {
		LoginDAO login = new LoginDAO();
		/* login.updateSql(idUpdate); */
	}
}
