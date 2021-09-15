package com.wdu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.exception.GenericException;
import com.wdu.model.User;
import com.wdu.service.AdminService;
import com.wdu.utils.Utils;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/user")
	public List<User> getAllUser() throws GenericException {

		List<User> userList = adminService.getAllUser();

		return userList;

	}

	@GetMapping("/user/{mobileNumber}")
	public User getUserByMobileNumber(@PathVariable String mobileNumber) throws GenericException {
		User user = null;

		if (Utils.validateMobileNumber(mobileNumber)) {

			user = adminService.getUserByMobileNumber(mobileNumber);
		}
		return user;

	}

}
