package com.example.restart.messagequeue;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTests {

    @Autowired
    private Producer producer;

    @Autowired
    private Publisher publisher;

/*    @Test
    public void contextLoads() {
        for(int i=0; i<10; i++){
            producer.sendMessage("test.queue", "Queue Message" + i );
        }
    }*/


    @Test
    public void test(){
        for(int i=0; i<10; i++){
            publisher.publisher("test.topic", "Topic Message" + i );
        }
    }
}
