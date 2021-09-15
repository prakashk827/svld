package com.wdu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wdu.exception.GenericException;
import com.wdu.model.User;
import com.wdu.service.UserService;
import com.wdu.utils.Utils;

@RestController
@SessionAttributes("user")
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public void registerUser(@RequestBody User user, HttpServletRequest clientUIdSession) throws GenericException {
		
		// Validate Mobile Number
		if (Utils.validateMobileNumber(user.getClientUId())) {

			int row = userService.save(user);
			if (row >= 1) {
				clientUIdSession.getSession().setAttribute("clientUId", user.getClientUId());
				userService.showClientUId(clientUIdSession);

				throw new GenericException("Registered successfully", 200, "success");
			} else {

				throw new GenericException("Error while registering please contact admin", 500, "error");
			}

		}

	}
}
