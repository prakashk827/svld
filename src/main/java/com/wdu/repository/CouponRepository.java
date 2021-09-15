package com.wdu.repository;

import java.util.List;

import com.wdu.dto.Coupons;
import com.wdu.exception.GenericException;

public interface CouponRepository {
	
	List<Coupons> getActiveCoupons() throws GenericException;

}
