package au.com.nab.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaAvroConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaAvroConsumerApplication.class, args);
	}

}
