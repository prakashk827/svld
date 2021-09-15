package com.wdu.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.admin.repository.ClientRepositoryImpl;
import com.wdu.exception.GenericException;

@Service
public class ClientService {

	@Autowired
	ClientRepositoryImpl clientRepositoryImpl;
	
	public List<Map<String, Object>> getAllRegisteredClients() throws GenericException {
		return clientRepositoryImpl.getAllRegisteredClient();
		
		
		
		
	}

	
	
}
