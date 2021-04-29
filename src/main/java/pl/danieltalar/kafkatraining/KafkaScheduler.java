package pl.danieltalar.kafkatraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.danieltalar.kafkatraining.common.Foo1;

@Component
public class KafkaScheduler {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTask() {
        this.template.send("topic2",System.currentTimeMillis() / 1000 );
    }
}
