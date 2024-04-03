package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsGithubIntegrationApplication {
	public static Logger logger = LoggerFactory.getLogger(JenkinsGithubIntegrationApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(JenkinsGithubIntegrationApplication.class, args);
		logger.info("Application is Up and Running");	
	}

}
