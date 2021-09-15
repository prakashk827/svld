package com.wdu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.dto.Coupons;
import com.wdu.exception.GenericException;
import com.wdu.repository.CouponRepository;

@Service
public class CouponService {

	@Autowired
	CouponRepository couponRepository;
	public List<Coupons> getActiveCoupons() throws GenericException {
		return couponRepository.getActiveCoupons();
		
	}

}
