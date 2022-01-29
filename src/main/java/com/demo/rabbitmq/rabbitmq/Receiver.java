package com.demo.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

  @RabbitListener(queues = "${queue.name}")
  public void receiveMessage(String message) {
      System.out.println(message);
  }
  
}
