package com.wdu.repository;

import java.util.List;

import com.wdu.exception.GenericException;
import com.wdu.model.User;

public interface AdminRepository {
	
	User getUserByMobileNumber(String mobileNumber) throws GenericException;

	List<User> getAllUser() throws GenericException;

}
