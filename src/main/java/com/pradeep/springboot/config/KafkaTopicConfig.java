package com.pradeep.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public NewTopic getKafkaTopic(){
        return TopicBuilder.name("FirstKafkaTopic").build();
    }
}
