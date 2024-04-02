package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsGithubIntegrationApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(JenkinsGithubIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case 1 executing..");
		assertEquals(true, true);
		logger.info("Test case successfully executed");
	}

}
