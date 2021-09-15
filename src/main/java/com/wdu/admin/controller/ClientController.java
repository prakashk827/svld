package com.wdu.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.service.ClientService;
import com.wdu.exception.GenericException;

@RestController
@RequestMapping("/admin")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	@GetMapping("/client/registered")
	public  ResponseEntity<?>  getAllRegisteredClients() throws GenericException {
		
		return ResponseEntity.ok().body(clientService.getAllRegisteredClients());
				
		
	}
}
