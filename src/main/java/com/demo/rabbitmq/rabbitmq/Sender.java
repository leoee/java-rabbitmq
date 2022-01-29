package com.demo.rabbitmq.rabbitmq;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Sender implements CommandLineRunner {
  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private Queue queue;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Sending message...");
    rabbitTemplate.convertAndSend(this.queue.getName(), "Hello from RabbitMQ!");
  }
}
