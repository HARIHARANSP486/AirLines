package com.chainsys.air.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.chainsys.air.util.ConnectionUtil;

public class JourneyDAO {
	static final Logger log = Logger.getLogger(FindAllDAO.class);
	/**
	 * This method is used to update the flight seats after booking the ticket
	 * 
	 * @param updateCount
	 * @param flightId
	 * @throws Exception
	 */
	public void seatsUpdate(int updateCount, long flightId) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "update flight_details set flg_avaliable_ticket=? where flg_id=?";
			log.debug("JourneyDAO :: seatsUpdate :: updateCount"+updateCount);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, updateCount);
			preparedStatement.setLong(2, flightId);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}

	/**
	 * This method is used to get the available tickets in the flight using flight
	 * id
	 * 
	 * @param flightId
	 * @return
	 * @throws Exception
	 */
	public int totalSeats(long flightId) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = ConnectionUtil.getConnection();
		String sql = "select flg_avaliable_ticket from flight_details where flg_id=?";
		log.debug("JourneyDAO :: totalSeats :: flightId"+flightId);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, flightId);
		int totalTicket = 0;
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			totalTicket = resultSet.getInt("flg_avaliable_ticket");
		}
		ConnectionUtil.close(connection, preparedStatement, null);
		return totalTicket;
	}
}
