package au.com.nab.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import postgres.public$.bsb.Envelope;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "postgres.public.bsb", groupId = "listener")
    public void comsume(ConsumerRecord<String, Envelope> record) {
        System.out.println("Received Message in group summary- key:" + record.key() + ", value:" + record.value());
    }
}
