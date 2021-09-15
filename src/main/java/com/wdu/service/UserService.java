package com.wdu.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.wdu.exception.GenericException;
import com.wdu.model.User;
import com.wdu.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userDao;

	public int save(User user) throws GenericException {
		int rowAffected = 0;
		try {
			rowAffected = userDao.save(user);
		} catch (SQLException e) {
			
			throw new GenericException("Error while inserting client profile record",
					HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
		}
		
		return rowAffected;

	}

	public void showClientUId(HttpServletRequest clientUIdSession) {
		
		String clientUid = (String) clientUIdSession.getSession().getAttribute("clientUId");
		System.out.println("Client uid is " + clientUid);
	}

}
