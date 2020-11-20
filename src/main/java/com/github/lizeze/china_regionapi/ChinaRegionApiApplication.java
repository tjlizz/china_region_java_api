package com.github.lizeze.china_regionapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.lizeze.china_regionapi.mapper")
public class ChinaRegionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinaRegionApiApplication.class, args);
	}

}
