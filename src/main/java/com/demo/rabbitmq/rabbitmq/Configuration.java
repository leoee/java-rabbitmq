package com.demo.rabbitmq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Configuration {
  @Value("${queue.name}")
  private String queueName;

  @Bean
  Queue queue() {
    System.out.println(queueName);
    return new Queue(queueName, true);
  }
}
