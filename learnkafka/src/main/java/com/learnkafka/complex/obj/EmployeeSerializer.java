package com.learnkafka.complex.obj;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer implements Serializable {

	public void configure(Map<String, ?> map, boolean b) {		  
	}
	  
	public byte[] serialize(String arg0, Employee arg1) {
		byte[] retVal = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			retVal = objectMapper.writeValueAsString(arg1).getBytes();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	  
	public void close() {
	}	

}
