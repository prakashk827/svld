package com.wdu.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wdu.dto.Coupons;

public class CouponRowMapper implements RowMapper<Coupons> {

	@Override
	public Coupons mapRow(ResultSet rs, int rowNum) throws SQLException {
		Coupons coupons = new Coupons();
		coupons.setCouponId(rs.getInt("id"));
		coupons.setCouponName(rs.getString("couponName"));
		return coupons;
	}

}
