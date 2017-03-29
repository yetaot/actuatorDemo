package com.ducetech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class CloudSleuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSleuthServiceApplication.class, args);
	}
}
