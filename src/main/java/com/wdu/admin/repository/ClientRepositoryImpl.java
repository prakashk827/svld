package com.wdu.admin.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.exception.GenericException;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Map<String, Object>> getAllRegisteredClient() throws GenericException {
		
		List<Map<String, Object>> registeredClientList = null;
		
		final String SQL = "SELECT * FROM client_profile";
		
		try {
			registeredClientList = jdbc.queryForList(SQL);
		} catch (Exception e) {
			throw new GenericException("Error while getting registered clients",
					HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}
		return registeredClientList;

	}

}
