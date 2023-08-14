package poc.kafka.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import poc.kafka.producer.broker.producer.TopicProducer;

@SpringBootApplication
public class ProducerApplication {
	private static TopicProducer topicProducer;

	public ProducerApplication(TopicProducer topicProducer) {
		ProducerApplication.topicProducer = topicProducer;
	}

	public static void main(String[] args) {

//		SpringApplication.run(ProducerApplication.class, args);
		topicProducer.send("asd"); // incluir mensagem
	}

}
