package com.chainsys.air.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.chainsys.air.model.FlightDetails;
import com.chainsys.air.model.JourneyDetails;
import com.chainsys.air.model.Passengers;
import com.chainsys.air.util.ConnectionUtil;

public class FindAllDAO {
 static final Logger log = Logger.getLogger(FindAllDAO.class);
	/**
	 * This method is used to get the journey flight details according to the user
	 * need
	 * 
	 * @param journey
	 * @return
	 * @throws Exception
	 */
	public ArrayList<FlightDetails> searchFlights(JourneyDetails journey) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select flg_id,flg_name,flg_source,flg_destination,flg_journey_date,flg_departure_time,"
				+ "flg_arrival_time,flg_avaliable_ticket,flg_adult_ticket,flg_children_ticket,flg_baby_ticket from flight_details where "
				+ "flg_source=? and flg_destination=? and flg_journey_date=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		log.debug("query"+sql);
		preparedStatement.setString(1, journey.getSource());
		preparedStatement.setString(2, journey.getDestination());
		preparedStatement.setDate(3, Date.valueOf(journey.getJourneyDate()));
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<FlightDetails> detailslist = new ArrayList<>();
		FlightDetails listdetails = null;
		while (resultSet.next()) {
			System.out.println("success");
			listdetails = new FlightDetails();
			listdetails.setFlightId(resultSet.getLong("flg_id"));
			listdetails.setFlightName(resultSet.getString("flg_name"));
			listdetails.setSource(resultSet.getString("flg_source"));
			listdetails.setDestination(resultSet.getString("flg_destination"));
			Date d = resultSet.getDate("flg_journey_date");
			LocalDate ld = d.toLocalDate();
			listdetails.setDateOfJourney(ld);
			listdetails.setDepartureTime(resultSet.getTime("flg_departure_time"));
			listdetails.setArrivalTime(resultSet.getTime("flg_arrival_time"));
			listdetails.setAvaliableTicket(resultSet.getInt("flg_avaliable_ticket"));
			listdetails.setAdultTicketRate(resultSet.getDouble("flg_adult_ticket"));
			listdetails.setChildTicketRate(resultSet.getDouble("flg_children_ticket"));
			listdetails.setBabyTicketRate(resultSet.getDouble("flg_baby_ticket"));
			detailslist.add(listdetails);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return detailslist;
	}

	/**
	 * This method is used to get passengers details using user_id
	 * @param bookid
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Passengers> getPassenger(int bookid) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select pass_name,pass_gender from travel_passengers where user_id=?";
		log.debug("query"+sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, bookid);
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Passengers> passengerslist = new ArrayList<>();
		Passengers passengers = null;
		while (resultSet.next()) {
			passengers = new Passengers();
			passengers.setName(resultSet.getString("pass_name"));
			passengers.setGender(resultSet.getString("pass_gender"));
			passengerslist.add(passengers);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return passengerslist;
	}

	/**
	 * This method is used to the flight details according to the flight Id and user specifications
	 * @param bookid
	 * @return
	 * @throws Exception
	 */
	public ArrayList<FlightDetails> checkCancelStatus(int bookid) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select flg_name,flg_source,flg_destination,"
				+ "flg_journey_date from flight_details where flg_id IN(select flight_id from travel_passengers where user_id=?)";
		log.debug("query"+sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, bookid);
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<FlightDetails> passengersList = new ArrayList<>();
		FlightDetails listPassengers = null;
		while (resultSet.next()) {
			listPassengers = new FlightDetails();
			// listPassengers.setName(resultSet.getString("flg_id"));
			listPassengers.setFlightName(resultSet.getString("flg_name"));
			listPassengers.setSource(resultSet.getString("flg_source"));
			listPassengers.setDestination(resultSet.getString("flg_destination"));
			// listPassengers.setDateOfJourney(Date.valueOf(resultSet.getString("flg_journey_date")).toLocalDate());
			Date d = resultSet.getDate("flg_journey_date");
			LocalDate ld = d.toLocalDate();
			listPassengers.setDateOfJourney(ld);
			passengersList.add(listPassengers);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return passengersList;
	}

	/**
	 * This method is used to get the passengers details from passengers table using
	 * user id
	 * 
	 * @param flightId
	 * @return
	 * @throws Exception
	 */
	public ArrayList<FlightDetails> checkStatus(int bookid) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select flg_name,flg_source,flg_destination,"
				+ "flg_journey_date from flight_details where flg_id IN(select flight_id from travel_passengers where user_id=?)";
		log.debug("query"+sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, bookid);
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<FlightDetails> passengersList = new ArrayList<>();
		FlightDetails listPassengers = null;
		while (resultSet.next()) {
			listPassengers = new FlightDetails();
			listPassengers.setFlightName(resultSet.getString("flg_name"));
			listPassengers.setSource(resultSet.getString("flg_source"));
			listPassengers.setDestination(resultSet.getString("flg_destination"));
			Date d = resultSet.getDate("flg_journey_date");
			LocalDate ld = d.toLocalDate();
			listPassengers.setDateOfJourney(ld);
			passengersList.add(listPassengers);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return passengersList;
	}
}