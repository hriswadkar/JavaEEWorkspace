package com.learnkafka.complex.obj;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDeserializer implements Deserializer {

	public void configure(Map configs, boolean isKey) {
	}

	public Object deserialize(String topic, byte[] data) {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = null;
		try {
			employee = mapper.readValue(data, Employee.class);			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return employee;
	}

	public void close() {
	}

}
