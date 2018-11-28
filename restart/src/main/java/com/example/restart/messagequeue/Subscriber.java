package com.example.restart.messagequeue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


@Service
public class Subscriber {

    @JmsListener(destination = "test.topic")
    public void subsrcible(String text){
        System.out.println(">>>>>>>> subscribe 的报文为:"+text);
    }
}
