package com.learnkafka.complex.obj;

import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDeserializer implements Deserializer<Employee> {
	private String encoding = "UTF8";

	public void configure(Map configs, boolean isKey) {
	}

	public Employee deserialize(String topic, byte[] data) {
		Employee employee = null;
		try {
			if(data == null) {
				System.out.println("Null data");
				return null;
			}
			ByteBuffer buf = ByteBuffer.wrap(data);
			int id = buf.getInt();
			
			int sizeOfEmpName = buf.getInt();
			byte[] empNameByte = new byte[sizeOfEmpName];
			buf.get(empNameByte);
			String deserializedEmpName = new String(empNameByte, encoding);
			
			int sizeOfDeptName = buf.getInt();
			//byte[] deptNameBytes = 
			
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
