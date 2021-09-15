package com.wdu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.exception.GenericException;
import com.wdu.model.User;
import com.wdu.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminDao;
	public User getUserByMobileNumber(String mobileNumber) throws GenericException {
		
		return adminDao.getUserByMobileNumber(mobileNumber);
	}
	public List<User> getAllUser() throws GenericException {
		return adminDao.getAllUser();
		
	}

}
