package com.chainsys.air.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.chainsys.air.model.FlightDetails;
import com.chainsys.air.util.ConnectionUtil;

public class AmountDAO {
	static final Logger log = Logger.getLogger(LoginDAO.class);
	/**
	 * This method id used to find Adult ticket amount using flight id
	 * 
	 * @param flightDetails
	 * @return
	 * @throws Exception
	 */
	public Double adultAmount(FlightDetails flightDetails) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		String sql = "select flg_adult_ticket from flight_details where flg_id=?";
		log.debug("query"+sql);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, flightDetails.getFlightId());
		ResultSet resultSet = preparedStatement.executeQuery();
		double adultAmount = 0;
		while (resultSet.next()) {
			adultAmount = resultSet.getDouble("flg_adult_ticket");
		}
		System.out.println("adultAmount" + adultAmount);
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return adultAmount;
	}

	/**
	 * This method id used to find Children ticket amount using flight id
	 * 
	 * @param flightDetails
	 * @return
	 * @throws Exception
	 */
	public Double childAmount(FlightDetails flightDetails) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		String sql = "select flg_children_ticket from flight_details where flg_id=?";
		log.debug("query"+sql);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, flightDetails.getFlightId());
		ResultSet resultSet = preparedStatement.executeQuery();
		double childAmount = 0;
		while (resultSet.next()) {
			childAmount = resultSet.getDouble("flg_children_ticket");
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return childAmount;
	}

	/**
	 * This method is used to find Baby ticket amount using flight id
	 * 
	 * @param flightDetails
	 * @return
	 * @throws Exception
	 */
	public Double babyAmount(FlightDetails flightDetails) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		String sql = "select flg_baby_ticket from flight_details where flg_id=?";
		log.debug("query"+sql);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, flightDetails.getFlightId());
		ResultSet resultSet = preparedStatement.executeQuery();
		double babyAmount = 0;
		while (resultSet.next()) {
			babyAmount = resultSet.getDouble("flg_baby_ticket");
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return babyAmount;
	}
}
