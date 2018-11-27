package com.example.restart;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.example.restart.mybatis.mapper")
public class RestartApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestartApplication.class, args);

	}
}
