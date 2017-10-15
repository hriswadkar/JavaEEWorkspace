import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import kafka.javaapi.producer.Producer;

public class KafkaProducer {
	private static Producer<Integer, String> producer;
	private static final String topic = "Hello-Kafka";
	
	public void initialize() {
		Properties producerProps = new Properties();
		producerProps.put("metadata.broker.list", "localhost:2181");
		producerProps.put("serializer.class", "kafka.serializer.StringEncoder");
		producerProps.put("request.required.acks", "1");
	}
}
