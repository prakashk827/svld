package com.wdu.admin.repository;

import java.util.List;

import com.wdu.admin.dto.RazorpayPayments;
import com.wdu.exception.GenericException;

public interface RazorPayRepository {
	
	List<String> updateRazorPayPayments(RazorpayPayments payment) throws GenericException;
	
}
