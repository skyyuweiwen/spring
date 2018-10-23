package com.example.restart.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User(){
    }

    public User(int id, String username, int age){
        this.id = id;
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }

    public User(String username, int age){
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
