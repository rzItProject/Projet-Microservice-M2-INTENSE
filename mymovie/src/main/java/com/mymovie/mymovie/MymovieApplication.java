package com.mymovie.mymovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MymovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymovieApplication.class, args);
	}
}
