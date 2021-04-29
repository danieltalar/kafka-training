package pl.danieltalar.kafkatraining;

import org.springframework.stereotype.Component;
import pl.danieltalar.kafkatraining.common.Foo1;

//@Component
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(id = "fooGroup1", topics = "topic1", groupId = "1")
    public void listen1(Foo1 foo) {
        System.out.println("Listener 1 Received: " + foo);
    }
    @org.springframework.kafka.annotation.KafkaListener(id = "fooGroup2", topics = "topic2", groupId = "2")
    public void listen2(String msg) {
        System.out.println("Listener 2 Received : " + msg);
    }

}
