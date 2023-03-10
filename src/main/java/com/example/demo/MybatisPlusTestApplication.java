package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="mapper")
public class MybatisPlusTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPlusTestApplication.class, args);
	}

}
