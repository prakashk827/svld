package com.wdu.admin.row.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wdu.admin.model.ClientProfile;

public class ClientProfileRowMapper implements RowMapper<ClientProfile> {

	@Override
	public ClientProfile mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ClientProfile clientProfile = new ClientProfile();
		clientProfile.setId(rs.getInt("id"));
		clientProfile.setClientUId(rs.getNString("clientUId"));
		clientProfile.setFirstName(rs.getString("firstName"));
		clientProfile.setLastName(rs.getString("lastName"));
		clientProfile.setPassword(rs.getString("password"));
		clientProfile.setDate(rs.getString("date"));
		
		return clientProfile;
	}

}
