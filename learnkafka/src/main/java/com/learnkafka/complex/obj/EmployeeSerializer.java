package com.learnkafka.complex.obj;

import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer implements Serializer<Employee> {
	
	private String encoding = "UTF8";

	public void configure(Map<String, ?> map, boolean b) {		  
	}
	  
	@SuppressWarnings("finally")
	public byte[] serialize(String topic, Employee data) {
		int sizeOfEmpId;
		int sizeOfEmpName;
		int sizeofDeptName;
		
		byte[] serializedEmpId = new byte[4];
		byte[] serializedEmpName;
		byte[] serializedDeptName;
		ByteBuffer buf = null;
		
		try {
			if(data == null)
				return null;
			
			ByteBuffer.wrap(serializedEmpId).putInt(data.getEmpId());
			sizeOfEmpId = serializedEmpId.length;
			
			serializedEmpName = data.getEmpName().getBytes(encoding);
			sizeOfEmpName = serializedEmpName.length;
			
			serializedDeptName = data.getDeptName().getBytes(encoding);
			sizeofDeptName = serializedDeptName.length;
			
			buf = ByteBuffer.allocate(4+4+sizeOfEmpId+4+sizeOfEmpName+4+sizeofDeptName);
			buf.putInt(data.getEmpId());
			buf.putInt(sizeOfEmpName);
			buf.put(serializedEmpName);
			buf.putInt(sizeofDeptName);
			buf.put(serializedDeptName);			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			return buf.array();
		}
	}
	  
	public void close() {
	}	

}
