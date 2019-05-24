package com.chainsys.air.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.chainsys.air.model.Passengers;
import com.chainsys.air.util.ConnectionUtil;

public class InsertPassengersDAO {
	static final Logger log = Logger.getLogger(FindAllDAO.class);

	/**
	 * This method is used to add the passengers details into the passengers table
	 * 
	 * @param passengers
	 * @param loginId
	 * @throws Exception
	 */
	public void addPassengers(Passengers passengers, int loginId) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into travel_passengers(book_id,pass_name,pass_gender,user_id) values(booking_id_seq.NEXTVAL,?,?,?)";
			log.debug("query" + sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, passengers.getName());
			preparedStatement.setString(2, passengers.getGender());
			preparedStatement.setInt(3, loginId);
			preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	/**
	 * This method is used to inserting the passengers details into the
	 * travel_passengers
	 * 
	 * @param passengerList
	 * @param loginId
	 * @param flightId
	 * @throws Exception
	 */
	public void addPassenger(List<Passengers> passengerList, int loginId, long flightId) throws Exception {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into travel_passengers(book_id,pass_name,pass_gender,user_id,flight_id) values(booking_id_seq.NEXTVAL,?,?,?,?)";
			log.debug("query" + sql);
			preparedStatement = connection.prepareStatement(sql);
			for (Passengers passengers : passengerList) {
				preparedStatement.setString(1, passengers.getName());
				preparedStatement.setString(2, passengers.getGender());
				preparedStatement.setInt(3, loginId);
				preparedStatement.setLong(4, flightId);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	/**
	 * This method is used to inserting the passengers details into the
	 * travel_passengers table
	 * 
	 * @param passengerList
	 * @param flightId
	 * @param bookid
	 * @throws Exception
	 */
	public void addPassengers(List<Passengers> passengerList, long flightId, int bookid) throws Exception {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into travel_passengers(book_id,pass_name,pass_gender,flight_id,user_id) values(booking_id_seq.NEXTVAL,?,?,?,?)";
			log.debug("query" + sql);
			preparedStatement = connection.prepareStatement(sql);
			for (Passengers passengers : passengerList) {
				preparedStatement.setString(1, passengers.getName());
				preparedStatement.setString(2, passengers.getGender());
				preparedStatement.setLong(3, flightId);
				preparedStatement.setInt(4, bookid);
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}
}