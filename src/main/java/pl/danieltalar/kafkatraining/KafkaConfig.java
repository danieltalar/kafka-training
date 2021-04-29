package pl.danieltalar.kafkatraining;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic1() {
        return new NewTopic("topic1", 1, (short) 1);
    }
    @Bean
    public NewTopic topic2() {
        return new NewTopic("topic2", 1, (short) 1);
    }
}
