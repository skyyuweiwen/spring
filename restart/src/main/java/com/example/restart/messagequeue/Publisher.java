package com.example.restart.messagequeue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@Service
public class Publisher {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void publisher(String destinationName, String message){
        System.out.println("Consumer publish 的报文为:"+ message);
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
    }


}
