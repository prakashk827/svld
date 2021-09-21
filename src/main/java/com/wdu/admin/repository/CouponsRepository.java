package com.wdu.admin.repository;

import java.util.List;
import java.util.Map;

public interface CouponsRepository {
	
	List<Map<String, Object>>  queryForList(String SQL);

	List<Map<String, Object>>  getAllCouponIds(String SQL);

}
