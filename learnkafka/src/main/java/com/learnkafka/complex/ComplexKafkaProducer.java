package com.learnkafka.complex;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.learnkafka.complex.obj.Employee;

public class ComplexKafkaProducer {

	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put("bootstrap.servers", "localhost:9093");
		properties.put("acks", "all");
		//properties.put("key.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
		//properties.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "com.learnkafka.complex.obj.EmployeeSerializer");
		
		//KafkaProducer<byte[],byte[]> myProducer= new KafkaProducer<byte[],byte[]>(properties);
		KafkaProducer<String, Employee> myProducer = new KafkaProducer<String, Employee>(properties);
		
		try {			
			for(int i=1;i<10;i++){
				Employee objEmp = new Employee(i,"name " + Integer.toString(i), "dept " + Integer.toString(i));
				//myProducer.send(new ProducerRecord<byte[], byte[]>("test14Oct17", objEmp.toString().getBytes()));	
				myProducer.send(new ProducerRecord<String, Employee>("test14Oct17", objEmp));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			myProducer.close();
		}		
	}

}
