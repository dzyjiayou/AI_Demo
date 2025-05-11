package com.itheima.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.itheima.ai.mapper")
@SpringBootApplication
public class HeimaAi1Application {

	public static void main(String[] args) {
		SpringApplication.run(HeimaAi1Application.class, args);
	}

}
