package com.wdu.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.admin.repository.CouponsRepository;

@Service
public class CouponsService {

	@Autowired
	CouponsRepository couponsRepository;

	public List<Map<String, Object>> couponAnalysis() {

		final String SQL = "SELECT COUNT(*) as total_coupons,client_address.clientUId,couponId,city FROM coupons_sold INNER JOIN client_address ON \r\n"
				+ "coupons_sold.clientUId = client_address.clientUId WHERE paymentStatus='complete' GROUP BY clientUId,couponId  ORDER BY total_coupons DESC;";

		return couponsRepository.queryForList(SQL);

	}

	public List<Map<String, Object>> getCouponIdAndNames() {
		
		final String SQL= "SELECT id,couponName FROM coupons ORDER BY id DESC";
		
		return couponsRepository.getCouponIdAndNames(SQL);
	}

}
