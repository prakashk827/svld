
package com.wdu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.exception.GenericException;
import com.wdu.model.User;
import com.wdu.row.mapper.UserRowMapper;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@Autowired
	JdbcTemplate jdbc;

	@SuppressWarnings("deprecation")

	@Override
	public User getUserByMobileNumber(String mobileNumber) throws GenericException {
		User user = null;
		final String QUERY_TO_GET_USER = "SELECT * FROM client_profile WHERE clientUId = ? LIMIT 1";

		try {
			user = jdbc.queryForObject(QUERY_TO_GET_USER, new Object[] { mobileNumber }, new UserRowMapper());

		} catch (EmptyResultDataAccessException e) {
			throw new GenericException("No user record found for the given mobile number",
					HttpStatus.BAD_REQUEST.value(), "error");
		}

		return user;
	}

	@SuppressWarnings("unchecked")

	@Override
	public List<User> getAllUser() throws GenericException {

		List<User> userList = null;
		final String QUERY_TO_GET_USER = "SELECT * FROM client_profile";

		try {
			//userList = jdbc.queryForList(QUERY_TO_GET_USER, new UserRowMapper());

		} catch (EmptyResultDataAccessException e) {
			throw new GenericException("No user record found for the given mobile number",
					HttpStatus.BAD_REQUEST.value(), "error");
		}

		return userList;
	}

}
