package com.wdu.admin.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CouponsRepositoryImpl implements CouponsRepository {

	@Autowired
	JdbcTemplate jdbc;
	@Override
	public List<Map<String, Object>>  queryForList(String SQL) {
		
		return  jdbc.queryForList(SQL);
		
	}
	@Override
	public List<Map<String, Object>> getCouponIdAndNames(String SQL) {
		
		return  jdbc.queryForList(SQL);
		
	}

}
