package com.example.restart.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import com.example.restart.mybatis.bean.User;
import com.example.restart.mybatis.mapper.UserMapper;
import com.example.restart.service.UserService;

@Service
@CacheConfig(cacheNames = "user")
public class UserServiceimpl implements UserService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Override
    @CachePut(value = "user", key = "#result.Id",condition = "#result!=null")
    public User getUserById(Integer id) {
        log.info("get user by id.");
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(Integer id, User user) {
        return userMapper.update(id, user);
    }

    @Override
    @CacheEvict(value="user",allEntries = true,beforeInvocation = true) //清楚所有缓存
    public int delete(Integer id) {
        return userMapper.delete(id);
    }
}
