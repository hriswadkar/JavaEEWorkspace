package com.learnkafka.consumer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class ConsumerKafka {

	private static KafkaConsumer<String, String> consumer;

	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			
			properties.setProperty("bootstrap.servers", "localhost:9094");
			properties.setProperty("group.id", "test");
			properties.setProperty("enable.auto.commit", "true");
			properties.setProperty("auto.commit.interval.ms", "1000");
			properties.setProperty("session.timeout.ms", "30000");		
			properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			properties.setProperty("auto.offset.reset", "earliest");
			
			consumer = new KafkaConsumer<String, String>(properties);
			consumer.subscribe(Arrays.asList("test14Oct17"));
			
			while(true) {
				ConsumerRecords<String, String> records = consumer.poll(100);
				for(ConsumerRecord<String, String> record : records) {
					System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
				}
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
