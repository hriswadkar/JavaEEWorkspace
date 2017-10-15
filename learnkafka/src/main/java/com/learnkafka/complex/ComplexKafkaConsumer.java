package com.learnkafka.complex;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.learnkafka.complex.obj.Employee;

public class ComplexKafkaConsumer {
	
	private static KafkaConsumer<String, Employee> consumer;

	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9094");
		properties.setProperty("group.id", "test2");
		properties.setProperty("enable.auto.commit", "false");
		properties.setProperty("auto.offset.reset", "earliest");
		//properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer");
		//properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer");
		properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.setProperty("value.deserializer", "com.learnkafka.complex.obj.EmployeeDeserializer");		
		
		//consumer = new KafkaConsumer<byte[], byte[]>(properties);
		consumer = new KafkaConsumer<String, Employee>(properties);
		consumer.subscribe(Arrays.asList("test14Oct17"));
		
		while(true) {
/*			ConsumerRecords<byte[], byte[]> records = consumer.poll(1000);
			for(ConsumerRecord<byte[], byte[]> record : records) {
				if(1 == 1) {
					
				}
			}
		}*/
			ConsumerRecords<String, Employee> records = consumer.poll(1000);
			for(ConsumerRecord<String, Employee> record : records) {
				System.out.println(record.value().toString());
			}
		}			
	}

}
