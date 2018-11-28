package com.example.restart.messagequeue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @JmsListener(destination = "test.queue")
    public void receiveQueue(String text){
        System.out.println("Consumer收到的报文为:"+text);
    }
}
