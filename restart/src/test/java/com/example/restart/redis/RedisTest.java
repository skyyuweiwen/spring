package com.example.restart.redis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.restart.mybatis.bean.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    JedisConnectionFactory jedisConnectionFactory;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<String, Object> redisTemplate1;

    @Test
    public void testRedisConnect(){
        RedisConnection connection = jedisConnectionFactory.getConnection();
        connection.set("hello".getBytes(), "world".getBytes());
        System.out.println(new String(connection.get("hello".getBytes())));
    }

    @Test
    public void testRedisTemplate(){
        redisTemplate1.opsForValue().set("key1", "value1");
        System.out.println(redisTemplate1.opsForValue().get("key1"));
    }

    @Test
    public void testRedisTemplateList(){
        User user1 = new User(1, "user1", 11);
        User user2 = new User(2,"user2",12);

        redisTemplate1.opsForList().rightPush("user", user1);
        redisTemplate1.opsForList().rightPush("user", user2);

        List<Object> userList = redisTemplate1.opsForList().range("user", 0, redisTemplate1.opsForList().size("user") -1 );

        for (Object object : userList){
            System.out.println((User)object);
        }
        System.out.println("count:" + redisTemplate1.opsForList().size("user"));
    }

    @Test
    public void test1(){
        stringRedisTemplate.opsForValue().append("StringKey", "String Key Value");
        String value = stringRedisTemplate.opsForValue().get("StringKey");
        System.out.println(value);
    }
}
