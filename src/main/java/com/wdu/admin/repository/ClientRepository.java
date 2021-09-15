package com.wdu.admin.repository;

import java.util.List;
import java.util.Map;

import com.wdu.exception.GenericException;

public interface ClientRepository {
	List<Map<String, Object>> getAllRegisteredClient() throws GenericException;
}
