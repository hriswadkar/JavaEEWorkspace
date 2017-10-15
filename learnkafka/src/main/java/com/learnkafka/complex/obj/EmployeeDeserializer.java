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
		int id = 0;
		String deserializedEmpName = "";
		String deserializedDeptName = "";
		
		try {
			if(data == null) {
				System.out.println("Null data");
				return null;
			}
			ByteBuffer buf = ByteBuffer.wrap(data);
			id = buf.getInt();
			
			int sizeOfEmpName = buf.getInt();
			byte[] empNameByte = new byte[sizeOfEmpName];
			buf.get(empNameByte);
			deserializedEmpName = new String(empNameByte, encoding);
			
			int sizeOfDeptName = buf.getInt();
			byte[] deptNameBytes = new byte[sizeOfDeptName];
			buf.get(deptNameBytes);
			deserializedDeptName = new String(deptNameBytes, encoding);					
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return new Employee(id, deserializedEmpName, deserializedDeptName);
	}

	public void close() {
	}

}
