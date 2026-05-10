package com.example.day_5;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic tumIslemlerTopic() {
        return new NewTopic("tumIslemler", 1, (short) 1);
    }
   @Bean
    public NewTopic normalIslemlerTopic() {
        return new NewTopic("normalIslemler", 1, (short) 1);
   }
   @Bean
    public NewTopic riskliIslemlerTopic() {
        return new NewTopic("riskliIslemler", 1, (short) 1);
   }
}
