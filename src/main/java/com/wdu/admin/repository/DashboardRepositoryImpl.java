package com.wdu.admin.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wdu.admin.model.AdminDashboard;

public class DashboardRepositoryImpl implements DashboardRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public AdminDashboard getDashboardSummary() {

		System.out.println("Total Avtive Clients " + getTotalClients());

		return null;
	}

	@SuppressWarnings("deprecation")
	private Integer getTotalClients() {
		
		final String sql = "SELECT COUNT(id) FROM `client_profile` WHERE status ='active' AND blocked='no'";
		
		return jdbc.queryForObject(sql, null, Integer.class);

	}

}
