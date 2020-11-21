package com.github.lizeze.china_regionapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.github.lizeze.china_regionapi.mapper")
public class ChinaRegionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinaRegionApiApplication.class, args);
	}
	@Configuration
	public class CORSConfiguration {
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurerAdapter() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
							.allowedHeaders("*")
							.allowedMethods("*")
							.allowedOrigins("*");
				}
			};
		}
	}
}
