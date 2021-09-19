package com.wdu.admin.repository;

import com.wdu.admin.dto.RazorpayPayments;
import com.wdu.exception.GenericException;

public interface RazorPayRepository {
	
	void updateRazorPayPayments(RazorpayPayments payment) throws GenericException;
	
}
