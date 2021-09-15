package com.wdu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wdu.dto.Coupons;
import com.wdu.exception.GenericException;

@Repository
public class CouponRepositoryImpl implements CouponRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<Coupons> getActiveCoupons() throws GenericException {
		List<Coupons> couponsList = null;
		final String sql = "SELECT * FROM `coupons` WHERE status = 'active'";
		try {
			 couponsList = jdbc.query(sql, new CouponRowMapper());

		} catch (Exception e) {
			throw new GenericException("Error while getting coupons", HttpStatus.INTERNAL_SERVER_ERROR.value(),"error");
		}
		return couponsList;

	}

}
