package com.example.restart.messagequeue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;


@Service("producer")
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(String destinationName, final String message){
        System.out.println("Consumer fasong的报文为:"+ message);
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
