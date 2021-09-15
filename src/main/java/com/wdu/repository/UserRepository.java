package com.wdu.repository;

import java.sql.SQLException;

import com.wdu.exception.GenericException;
import com.wdu.model.User;

public interface UserRepository {
	
	int save(User user) throws GenericException, SQLException;

}
