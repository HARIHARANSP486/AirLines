package com.chainsys.air.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.chainsys.air.util.ConnectionUtil;

public class LoginDAO {
	static final Logger log = Logger.getLogger(LoginDAO.class);
	/**
	 * This method is used for login checking progress
	 * 
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Boolean login(String userName, String password) throws Exception {
		Boolean isFound = false;
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select user_name,password from login where user_name=? and password=?";
		log.debug("LoginDAO :: login :: userName"+userName);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			isFound = true;
		}
		return isFound;
	}

	/**
	 * This method is used to get the login id using user name and password in the
	 * login table
	 * 
	 * @param userName
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public int id(String userName, String password) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select login_id from login where user_name=? and password=?";
		log.debug("LoginDAO :: id :: userName"+userName);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		int loginId = 0;
		while (resultSet.next()) {
			loginId = resultSet.getInt("login_id");
		}
		return loginId;
	}
	/**
	 * This method is used to create the booking id
	 * @param loginId
	 * @throws Exception
	 */
	public void createBookId(int loginId) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String sql="insert into bookid(booking_id) values(new_seq.nextval,?) ";
		log.debug("LoginDAO :: createBookId :: loginId"+loginId);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, loginId);
		preparedStatement.executeUpdate();
	}
	/**
	 * This method is used to select the booking id
	 * @param LoginId
	 * @return
	 * @throws Exception
	 */
	public int getBkId(int LoginId) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String sql="select booking_id from bookid where loginID = ?";
		log.debug("LoginDAO :: getBkId :: LoginId"+LoginId);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1,LoginId);
		ResultSet resultSet=preparedStatement.executeQuery();
		int idBooking=0;
		if(resultSet.next())
		{
			idBooking = resultSet.getInt("booking_id");
		}
		return idBooking;
	}
	
	
	public int getLogin(String userName, String password) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select login_id from login where user_name=? and password=?";
		log.debug("LoginDAO :: getLogin :: userName"+userName);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		int loginId=0;
		if (resultSet.next()) {
			loginId=resultSet.getInt("login_id");
		}
		return loginId;
	}

}
