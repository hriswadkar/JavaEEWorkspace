package com.test.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SimpleProducer {

	public SimpleProducer() {
		try {
			Properties props = new Properties();
			props.put("bootstrap.servers", "localhost:9092");
			props.put("acks", "all");
			props.put("retries", 0);
			props.put("batch.size", 16384);
			props.put("linger.ms", 1);
			props.put("buffer.memory", 33554432);
			props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			
			KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
			for (int i = 11; i < 20; i++) {
				producer.send(new ProducerRecord<String, String>("testrepl", Integer.toString(i), Integer.toString(i)));
			}
			producer.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}		
	
	public static void main(String[] args) {		
		SimpleProducer obj = new SimpleProducer();
		
		//SimpleConsumer obj2 = new SimpleConsumer();
	}

}
