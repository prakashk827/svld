package com.wdu.admin.repository;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.admin.exception.CfException;

public interface UserDatDao  {
	
	 public void saveLoanFrontServiceData(UserDataDTO userData) throws CfException;

}
