package com.wdu.row.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wdu.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();

		user.setId(rs.getInt("id"));
		user.setClientUId(rs.getString("clientUId"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setPassword(rs.getString("password"));
		user.setDate(rs.getString("date"));
		user.setTime(rs.getString("time"));
		user.setImage(rs.getString("image"));
		user.setStatus(rs.getString("status"));
		user.setWinner(rs.getString("status"));
		user.setBlocked(rs.getString("blocked"));
		user.setIsFilled(rs.getString("isFilled"));
		
		return user;
	}

}
