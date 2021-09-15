package com.wdu.repository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.exception.GenericException;
import com.wdu.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	JdbcTemplate jdbc;

	@SuppressWarnings("deprecation")
	@Override
	public int save(User user) throws GenericException, SQLException {
		int rowAffected = 0;
		int countUser = 0;
		final String GET_USER_ID_BY_CLIENT_UID = "SELECT COUNT(id) FROM client_profile WHERE clientUId = ?";
		try {
			countUser = jdbc.queryForObject(GET_USER_ID_BY_CLIENT_UID, new Object[] { user.getClientUId() },
					Integer.class);
		} catch (Exception e) {
			throw new GenericException("Error while getting user id by mobile number", 500, "error");
		}

		if (countUser >= 1) {

			throw new GenericException("User already registered with this mobile number.Please try with different.",
					HttpStatus.BAD_REQUEST.value(), "error");
		} else {

			final String QUERY_TO_SAVE_USER = "INSERT INTO `client_profile` (`clientUId`, `firstName`, `lastName`, `password`,`date`,`time`,`image`) VALUES(?,?,?,?,?,?,?)";
			Object param[] = { user.getClientUId(), user.getFirstName(), user.getLastName(), user.getPassword(),
					user.getDate(), user.getTime(), user.getImage() };

			rowAffected = jdbc.update(QUERY_TO_SAVE_USER, param);

		}
		return rowAffected;

	}

}
